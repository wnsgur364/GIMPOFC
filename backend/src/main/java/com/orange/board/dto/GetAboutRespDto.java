package com.orange.board.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.orange.board.entity.ResCode;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAboutRespDto {
    private String str;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
