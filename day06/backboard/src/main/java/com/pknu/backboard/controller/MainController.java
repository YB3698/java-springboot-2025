package com.pknu.backboard.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Log4j2

public class MainController {

    @GetMapping("/start")
    public String start() {
        log.info("/start 실행!"); // 콘솔에 로그 출력
        return "start"; // start.html로 이동
    }
}
