package com.example.Boardgame.service;
import com.example.Boardgame.entity.Board;

import java.util.HashMap;
import java.util.List;


public interface MyBatisInterfaceService {
    List<HashMap<String, Object>> findAll();

    HashMap<String, Object> findById(HashMap<String,Object> params);
    List<Board> boardAll();
    HashMap<String, Object> findBoard(String name);

    void newBoard(HashMap<String, Object> newBoard);
    void editBoard(HashMap<String, Object> params);
    boolean deleteBoard(Long id);
}