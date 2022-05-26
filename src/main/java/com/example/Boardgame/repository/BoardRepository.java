package com.example.Boardgame.repository;

import com.example.Boardgame.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {//<Entitiy, id유형>
}