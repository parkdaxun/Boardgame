package com.example.Boardgame.repository;

import com.example.Boardgame.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepository extends JpaRepository <User,Long> {//<Entitiy, id유형>

}

