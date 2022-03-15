package com.campus.myapp.service;

import java.util.List;

import com.campus.myapp.vo.BoardVO;
import com.campus.myapp.vo.PagingVO;

public interface BoardService {
	//글등록
	public int boardInsert(BoardVO vo);
	
	//글목록
	public List<BoardVO> boardList(PagingVO pVO);
	
	//총레코드수
	public int totalRecord(PagingVO pVO);
	
	//글 1개 선택
	public BoardVO boardSelect(int no);
	
	//조회수 증가
	public void hitCount(int no);
	
	//글 수정
	public int boardUpdate(BoardVO vo);
}
