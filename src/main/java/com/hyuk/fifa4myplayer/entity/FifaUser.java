package com.hyuk.fifa4myplayer.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FifaUser {

    @Id
    @GeneratedValue
    @Column(name="notice_id")
    private Long fifaUserId;

    private String nickname;


}
