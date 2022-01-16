package com.springdemo.dao;

import com.springdemo.model.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BoardDAO {

    @Autowired
    private SqlSession sqlSession;

    public void write(BoardVO boardVO) throws Exception{
        sqlSession.insert("insert",boardVO);
    }

    public List<BoardVO> selectBoardList() throws Exception{
        return sqlSession.selectList("selectBoardList");
    }

    public BoardVO read(int bno) throws Exception{
        return sqlSession.selectOne("read",bno);
    }

    public void update(BoardVO boardVO) throws Exception{
        sqlSession.update("update",boardVO);
    }

    public void delete(int bno) throws Exception{
        sqlSession.delete("delete",bno);
    }
}
