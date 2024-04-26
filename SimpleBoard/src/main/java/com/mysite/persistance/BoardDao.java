package com.mysite.persistance;

import java.util.List;

import com.mysite.domain.Board;

public interface BoardDao {
	public List<Board> getList() throws Exception;
	public int write(Board board) throws Exception;
	public Board read(int bNo) throws Exception;
	public int update(Board board) throws Exception;
	public int delete(int bNo) throws Exception;
}
