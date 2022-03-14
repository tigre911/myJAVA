package com.campus.myapp.controller;

import java.nio.charset.Charset;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.campus.myapp.service.BoardService;
import com.campus.myapp.vo.BoardVO;
import com.campus.myapp.vo.PagingVO;

@RestController // @Controller + @ResponseBody 합친것
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	BoardService service;

	// 글목록
	@GetMapping("boardList")
	public ModelAndView boardList(PagingVO pVO) {
		ModelAndView mav = new ModelAndView();
		
		//총레코드수
		pVO.setTotalRecord(service.totalRecord());

		// db처리
		mav.addObject("list",service.boardList(pVO));
		mav.addObject("pVO",pVO);
		
		mav.setViewName("board/boardList"); // WEB-INF/views/board/boardList.jsp
		return mav;
	}

	// 글등록 폼
	@GetMapping("boardWrite")
	public ModelAndView name() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardWrite");
		return mav;
	}

	// 글등록
	@PostMapping("boardWriteOk")
	public ResponseEntity<String> boardWriteOk(BoardVO vo, HttpServletRequest request) {
		vo.setIp(request.getRemoteAddr());// 접속자 아이피
		// 글쓴이-session 로그인 아이디를 구한다.
		vo.setUserid((String) request.getSession().getAttribute("logId"));

		// DB작업
		ResponseEntity<String> entity = null; // 데이터와 처리상태를 가진다.
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/html; charset=utf-8");
		// headers.setContentType(new MediaType("text","html",
		// Charset.forName("UTF-8")));
		try {
			service.boardInsert(vo);
			// 정상구현
			String msg = "<script>";
			msg += "alert('글이 등록되었습니다');";
			msg += "location.href='/myapp/board/boardList';";
			msg += "</script>";
			entity = new ResponseEntity<String>(msg, headers, HttpStatus.OK); // 200

		} catch (Exception e) {
			e.printStackTrace();
			// 등록안됨
			String msg = "<script>";
			msg += "alert('글 등록에 실패하였습니다');";
			msg += "history.back();";
			msg += "</script>";
			entity = new ResponseEntity<String>(msg, headers, HttpStatus.BAD_REQUEST); //

		}
		return entity;
	}
}
