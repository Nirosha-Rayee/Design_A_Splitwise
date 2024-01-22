package com.example.splitwise.controllers;

import com.example.splitwise.dtos.SettleUpGroupRequestDto;
import com.example.splitwise.dtos.SettleUpGroupResponseDto;
import com.example.splitwise.dtos.SettleUpUserRequestDto;
import com.example.splitwise.dtos.SettleUpUserResponseDto;
import com.example.splitwise.services.SettleUpService;
import org.springframework.stereotype.Controller;

@Controller
public class SettleUpController {
    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto settleUpGroupRequestDto) {

        settleUpService.settleUpGroup(settleUpGroupRequestDto.getGroupId());
        return null;
    }

    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto settleUpUserRequestDto) {

        settleUpService.settleUpUser(settleUpUserRequestDto.getUserId());
        return null;
    }

}
