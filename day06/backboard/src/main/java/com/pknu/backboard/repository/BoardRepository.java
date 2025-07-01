package com.pknu.backboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pknu.backboard.entity.Board;

@Repository // 컨트롤러, 서비스, 엔티티는 @로 선언해줘야하지만 레파지토리는 굳이 안해줘도됨
public interface BoardRepository extends JpaRepository<Board, Long> {
    // 부가적인 기능이 더 필요
    Board findByTitle(String title); // 제목으로 검색.

    List<Board> findByTitleLike(String title); // 비슷한 제목으로 검색.
}
