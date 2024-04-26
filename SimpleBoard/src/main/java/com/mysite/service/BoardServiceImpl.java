package com.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.domain.Board;
import com.mysite.persistance.BoardDao;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired 
	private BoardDao boardDao;

	@Override
	public List<Board> getList() throws Exception {
		return boardDao.getList();
	}

	@Override
	public int write(Board board) throws Exception {
		return boardDao.write(board);
	}

	@Override
	public Board read(int bNo) throws Exception {
		return boardDao.read(bNo);
	}

	@Override
	public int update(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int bNo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
