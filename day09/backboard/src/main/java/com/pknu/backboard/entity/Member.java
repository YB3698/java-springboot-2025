package com.pknu.backboard.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long mno;

    @Column(unique = true, nullable = false, length = 150)
    private String username;   // email로 사용

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false, length = 150)
    private String email;      // username과 동일하지만

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regDate;
}