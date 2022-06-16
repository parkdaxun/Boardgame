package com.example.Boardgame.repository;
import com.example.Boardgame.entity.Board;

import org.apache.ibatis.annotations.Mapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Mapper
public interface MyBatisMapper {
    List<HashMap<String,Object>> findAll();

    HashMap<String,Object> findById(HashMap<String,Object> params);
    List<Board> boardAll();
    HashMap<String,Object> findBoard(String name);

    void newBoard(HashMap<String,Object> board);
    void editBoard(HashMap<String,Object> params);
    void deleteBoard(Long id);
}
