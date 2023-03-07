package com.hyuk.fifa4myplayer.repository;

import com.hyuk.fifa4myplayer.entity.FifaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FifaUserRepository extends JpaRepository<FifaUser, Long> {

    boolean existsByNickname(String nickname);

    FifaUser findByNickname(String nickname);
}
