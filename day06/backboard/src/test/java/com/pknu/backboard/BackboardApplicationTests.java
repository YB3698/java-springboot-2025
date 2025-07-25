package com.pknu.backboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.repository.BoardRepository;

@SpringBootTest
class BackboardApplicationTests {

   @Autowired
   private BoardRepository boardRepository;

   @Test
   void contextLoads() {
   }

   @Test
   void testInsertJpa() {
      Board board1 = new Board();
      board1.setTitle("첫번째 게시글입니다."); // @Setter에서 자동으로 생성해주는 메서드
      board1.setContent("내용은 없습니다.");
      board1.setCreateDate(LocalDateTime.now()); // @CreatedDate에서 자동으로 생성해주는 메서드

      Board board2 = new Board();
      board2.setTitle("두번째 게시글입니다.");
      board2.setContent("내용은 또 없습니다.");
      board2.setCreateDate(LocalDateTime.now());

      this.boardRepository.save(board1); // save() 메서드를 통해 Board 엔티티를 저장 (INSERT실행)
      this.boardRepository.save(board2); // save() 메서드를 통해 Board 엔티티를 저장 (INSERT실행)
   }

   @Test // Select * 테스트
   void testSelectJpa() {
      List<Board> all = this.boardRepository.findAll(); // findAll() 메서드를 통해 모든 게시글을 조회
      // 테스트시 내가 기대하는 값과 현재 값이 같은지 확인메서드
      assertEquals(2, all.size()); // 게시글이 2개가 저장되어 있어야 함

      Board board = all.get(0); // 첫번째 게시글을 가져옴
      assertEquals("첫번째 게시글입니다.", board.getTitle()); // 첫번째 게시글의 제목이 맞는지 확인
   }

   @Test // SELECT FROM WHERE 테스트
   void testSelectOneJpa() {
      // Optional -> Null을 허용하는 객체
      Optional<Board> opBoard = this.boardRepository.findById(2L);
      if (opBoard.isPresent()) {
         Board board = opBoard.get();
         assertEquals("내용은 또 없습니다.", board.getContent()); // 게시글의 내용이 맞는지 확인
      }
   }

   @Test
   void testSelectByTitle() {
      Board board = this.boardRepository.findByTitle("두번째 게시글입니다.");
      assertEquals(2L, board.getBno()); // 게시글 번호가 2번인지 확인
   }

   @Test // SELECT FROM LIKE
   void testSelectbyTitleLike() {
	  List<Board> boards = this.boardRepository.findByTitleLike("%게시글%"); // 제목에 '게시글'이 포함된 게시글을 조회
	  assertEquals(4, boards.size()); // 게시글이 2개가 조회되어야 함

	  Board board = boards.get(0); // 첫번째 게시글을 가져옴
	  assertEquals("첫번째 게시글입니다.", board.getTitle()); // 첫번째 게시글의 제목이 맞는지 확인
   }

   @Test // DELETE 테스트
   void testDeleteLastOne() {
		assertEquals(4, boardRepository.count());
		Optional<Board> opBoard = this.boardRepository.findById(2L);
		assertTrue(opBoard.isPresent());

		Board board = opBoard.get();
		this.boardRepository.delete(board); // 게시글 삭제
		assertEquals(3, boardRepository.count()); // 게시글이 1개 삭제되어야 함
   }
   @Test // 수정 테스트
   void testUpdateOne() {
		Optional<Board> opBoard = this.boardRepository.findById(1L); // 1번 보드데이터 가져오기
		assertTrue(opBoard.isPresent()); // 가져온 데이터가 있는지 여부 체크

		Board board = opBoard.get(); // Optional<Board>가 NULL이면 get() 할 수 없으므로, isPresent()로 체크 후 get() 호출
		board.setContent("내용이 테스트에서 변경되었습니다!!!");

		this.boardRepository.save(board);

		// 테스트 내용 그대로 JPA 코딩 시 사용가능
   }
}
