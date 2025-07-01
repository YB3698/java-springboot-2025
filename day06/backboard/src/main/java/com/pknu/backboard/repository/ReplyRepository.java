package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pknu.backboard.entity.Reply;
@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    // Reply 엔티티에 대한 CRUD 메서드가 JpaRepository를 통해 자동으로 제공됨
    // 추가적인 메서드가 필요하면 여기에 정의할 수 있음

}
