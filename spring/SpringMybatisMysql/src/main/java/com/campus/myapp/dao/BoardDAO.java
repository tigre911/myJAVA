package com.campus.myapp.dao;

import java.util.List;

import com.campus.myapp.vo.BoardVO;
import com.campus.myapp.vo.PagingVO;

public interface BoardDAO {
	//글등록
	public int boardInsert(BoardVO vo);
	//글목록
	public List<BoardVO> boardList(PagingVO pVO);
	//총레코드수
	public int totalRecord();
}
