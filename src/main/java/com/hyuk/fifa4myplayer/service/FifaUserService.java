package com.hyuk.fifa4myplayer.service;

import com.hyuk.fifa4myplayer.dto.FifaUserDTO;
import com.hyuk.fifa4myplayer.entity.FifaUser;
import com.hyuk.fifa4myplayer.repository.FifaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FifaUserService {

    @Autowired
    private FifaUserRepository fifaUserRepository;


    public FifaUser makeuser(String nickname) {
        if (fifaUserRepository.existsByNickname(nickname)) {
            return fifaUserRepository.findByNickname(nickname);
        }
        FifaUser newFifaUser = new FifaUser();
        newFifaUser.setNickname(nickname);

        return fifaUserRepository.save(newFifaUser);
    }

    public List<FifaUser> findAllUsers() {
        return fifaUserRepository.findAll();
    }
}
