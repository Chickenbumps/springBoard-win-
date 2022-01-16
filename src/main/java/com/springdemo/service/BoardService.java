package com.springdemo.service;

import com.springdemo.dao.BoardDAO;
import com.springdemo.model.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDAO boardDAO;

    public void write(BoardVO boardVO) throws Exception{
        boardDAO.write(boardVO);
    }

    public List<BoardVO> selectBoardList() throws Exception{
        return boardDAO.selectBoardList();
    }

    public BoardVO read(int bno) throws Exception {
        return boardDAO.read(bno);
    }

    public void update(BoardVO boardVO) throws Exception {
        boardDAO.update(boardVO);
    }

    public void delete(int bno) throws Exception {
        boardDAO.delete(bno);
    }
}
