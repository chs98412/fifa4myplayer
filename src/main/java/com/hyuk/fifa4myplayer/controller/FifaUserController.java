package com.hyuk.fifa4myplayer.controller;


import com.hyuk.fifa4myplayer.dto.FifaUserDTO;
import com.hyuk.fifa4myplayer.dto.FifaUserRequestDTO;
import com.hyuk.fifa4myplayer.entity.FifaUser;
import com.hyuk.fifa4myplayer.service.FifaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("fifauser")
public class FifaUserController {

    @Autowired
    private FifaUserService fifaUserService;

    @GetMapping("test")
    public String test() {
        return "hello World";
    }

    @PostMapping("/makefifauser")
    public FifaUserDTO makeFifaUser(@RequestBody FifaUserRequestDTO fu) {
        FifaUser fifaUser = fifaUserService.makeuser(fu.getNickname());

        FifaUserDTO fifaUserDTO = new FifaUserDTO();
        fifaUserDTO.setNickname(fifaUser.getNickname());
        return fifaUserDTO;
    }

    @GetMapping("findallfifauser")
    public List<FifaUserDTO> findAllFifaUsers() {
        List<FifaUser> fifaUsers = fifaUserService.findAllUsers();
        List<FifaUserDTO> fifaUserDTOS = new ArrayList<>();
        for (FifaUser fifaUser : fifaUsers) {
            FifaUserDTO newDTO = new FifaUserDTO();
            newDTO.setNickname(fifaUser.getNickname());
            fifaUserDTOS.add(newDTO);
        }

        return fifaUserDTOS;
    }
}
