package com.pknu.backboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

// 스프링 시큐리티 로그인용 서비스
@Service
@RequiredArgsConstructor
public class MemberSecurityService implements UserDetailsService {

    @Autowired
    private final MemberRepository memberRepository;

    // UserDetailsService 인터페이스 내에 정의해놓은 메서드 구현
    // 스프링 시큐리티와 직접 만든 회원정보 테이블은 매핑하는 작업 구현
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Member> opMember = this.memberRepository.findByUsername(username);
        if (opmember.isEmpty()) { // username을 가진 회원이 없으면
            throw new UsernameNotFoundException(Stirng.format("%S 사용자가 없습니다.", username));
        }
        Member member = opMember.get();

        List<GrantedAuthority> authorities = new.ArrayList<>();
        if ("admin".equals(username)) {
            authorities.add(new SimpleGrantedAuthority(MemberRole.ADMIN.getValue())); // ROLE_ADMIN 권한 부여
        } else {
            authorities.add(new SimpleGrantedAuthority(MemberRole.USER.getValue()));
        }
}
