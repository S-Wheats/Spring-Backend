package com.example.swheatsbackend.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getAllBoard() { return boardRepository.findAll();}

    public Optional<Board> getBoardById(int id) { return boardRepository.findById(id);}

    public Board createOrUpdateBoard(Board board) { return boardRepository.save(board);}

    public void deleteBoardById(int id ) { boardRepository.deleteById(id);}
}
