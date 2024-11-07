package com.example.splitwisenov24.controllers;

import com.example.splitwisenov24.dtos.SettleUpGroupRequestDto;
import com.example.splitwisenov24.dtos.SettleUpGroupResponseDto;
import com.example.splitwisenov24.dtos.SettleUpUserRequestDto;
import com.example.splitwisenov24.dtos.SettleUpUserResponseDto;
import com.example.splitwisenov24.services.SettleUpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/settleup/

@RestController
@RequestMapping("/settleUp")
public class SettleUpController {
    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto requestDto) {
        return null;
    }

    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto requestDto) {
        return null;
    }
}
