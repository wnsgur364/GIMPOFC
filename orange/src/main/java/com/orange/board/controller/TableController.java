package com.orange.board.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@RestController
public class TableController {
    @GetMapping("hello")
    public List<String> Hello() { return Arrays.asList("서버 포트는 8080", "리엑트 포트는 3000"); }
    
}
