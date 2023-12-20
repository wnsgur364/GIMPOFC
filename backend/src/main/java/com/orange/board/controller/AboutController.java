package com.orange.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.board.dto.GetAboutRespDto;

@RestController
public class AboutController {
    @GetMapping("/api/about") 
    public GetAboutRespDto hello() {
        GetAboutRespDto getAboutRespDto = new GetAboutRespDto();
        getAboutRespDto.setStr("Hello!");
        return getAboutRespDto;
    }
}
