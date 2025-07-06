package com.pknu.backboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.entity.Member;
import com.pknu.backboard.service.BoardService;
import com.pknu.backboard.service.MemberService;
import com.pknu.backboard.validation.BoardForm;
import com.pknu.backboard.validation.ReplyForm;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board") // 공통이 되는 URL
public class BoardController {

    @Autowired
    private final BoardService boardService;

    @Autowired
    private final MemberService memberService; // 작성자를 위해서 추가

    // @GetMapping("/list") // 각 상세 URL만 작성
    // public String getList(Model model) {
    // List<Board> boardList = this.boardService.getBoardList();

    // model.addAttribute("boardList", boardList);
    // return "board_list"; // board_list.html 파일로 연결
    // }

    // @GetMapping("/list") // 각 상세 URL만 작성
    // public String getList(Model model, @RequestParam(value = "page", defaultValue
    // = "0") int page) {
    // Page<Board> boardPaging = this.boardService.getBoardList(page);
    // model.addAttribute("boardPaging", boardPaging);
    // return "board/board_list"; // board_list.html 파일로 연결
    // }

    @GetMapping("/detail/{bno}")
    public String getDetail(Model model, @PathVariable("bno") Long bno, ReplyForm replyForm) {
        Board board = this.boardService.getBoardOne(bno);
        model.addAttribute("board", board);
        return "board/board_detail"; // board_detail.html 파일로 연결
    }

    @PreAuthorize("isAuthenticated()") // 로그인한 사용자만 접근 가능
    @GetMapping("/create") // 게시글 작성 화면 연결
    public String getCreate(BoardForm boardForm) {
        return "board/board_create"; // board_create.html 파일로 연결
    }

    @PostMapping("/create") // 게시글 저장버튼 클릭 후
    public String setCreate(@Valid BoardForm boardForm, BindingResult bindingResult,
            java.security.Principal principal) { // board_create.html에서 input,
        // textarea 부분 id
        if (bindingResult.hasErrors()) {
            return "board_create";
        }

        // 접속한 사용자 정보
        Member member = this.memberService.getMember(principal.getName());

        this.boardService.setBoardOne(boardForm.getTitle(), boardForm.getContent(), member); // service로 연결
        return "redirect:/board/list"; // 작성 완료 후 목록으로
    }

}
 