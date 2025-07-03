package com.pknu.backboard.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pknu.backboard.entity.Member;
import com.pknu.backboard.repository.MemberRepository;

public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    public Member setMember(String username, Stirng email, Stirng password) {
        Member member = new Member();
        member.setUsername(username);
        member.setEmail(email);
        // member.setPassword(password); // 12345가 그대로 들어감
        BCryptPasswordEncoder pwdEnc = new BCryptPassordEncoder();
        member.setPassword(pwdEnc.encode(password)); // 12345 -> 암호화돼서 나옴

        this.memberRepository.save(member);
        return member;
    }
    
}
