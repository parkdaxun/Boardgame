package com.example.Boardgame.repository;

import com.example.Boardgame.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {
    List<Board> findAllByName(String name);//<Entitiy, id유형>
}