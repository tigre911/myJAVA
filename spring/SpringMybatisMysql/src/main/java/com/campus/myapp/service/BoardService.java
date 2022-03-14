package com.campus.myapp.service;

import java.util.List;

import com.campus.myapp.vo.BoardVO;
import com.campus.myapp.vo.PagingVO;

public interface BoardService {
	//글등록
	public int boardInsert(BoardVO vo);
	
	public List<BoardVO> boardList(PagingVO pVO);
	
	public int totalRecord();
}
