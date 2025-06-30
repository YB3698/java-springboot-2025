package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByTitle(String title); // 제목으로 게시글을 조회하는 메서드
}
