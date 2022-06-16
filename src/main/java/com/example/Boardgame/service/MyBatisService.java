package com.example.Boardgame.service;

import com.example.Boardgame.entity.Board;
import com.example.Boardgame.repository.MyBatisMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MyBatisService implements MyBatisInterfaceService{
    @Autowired
    MyBatisMapper myBoardRepository;

    public List<HashMap<String,Object>> findAll(){
        return myBoardRepository.findAll();
    }
    public HashMap<String,Object> findById(HashMap<String, Object> params){
        return myBoardRepository.findById(params);
    }
    public List<Board> boardAll(){
        return myBoardRepository.boardAll();
    }
    public HashMap<String,Object> findBoard(String name){
        return myBoardRepository.findBoard(name);
    }
    public void newBoard(HashMap<String,Object> newBoard){
        myBoardRepository.newBoard(newBoard);
    }
    public void editBoard(HashMap<String,Object> params){
        myBoardRepository.editBoard(params);
    }
    public boolean deleteBoard(Long id){
        try{
            myBoardRepository.deleteBoard(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
