package com.hyuk.fifa4myplayer.dto;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FifaUserDTO {

    private String nickname;

    private Boolean isExist;
}
