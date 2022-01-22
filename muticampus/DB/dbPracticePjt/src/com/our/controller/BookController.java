package com.our.controller;

import java.util.Scanner;

import com.our.service.BookService;

public class BookController {
	
	
	
	public void start() {
		System.out.println("[BookController]:::start()");
		Scanner sc = new Scanner(System.in);
		BookService bookService = new BookService();
		
		while (true) {
			System.out.println("[메뉴] : 1.도서 목록 \t 2.도서 등록 \t 3.도서 수정 \t 4.도서 삭제 \t 5.종료");
			int inputNum = Integer.parseInt(sc.nextLine());
			
			if (inputNum == 1) {
				bookService.showBookList();
			}else if (inputNum == 2) {
				bookService.insertBook();
			}else if (inputNum == 3) {
				bookService.modifyBook();
			}else if (inputNum == 4) {
				bookService.deleteBook();
			}else if (inputNum == 5) {
				System.exit(0);
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public static void main(String[] args) {
		new BookController().start();
	}
	//전체 목록 확인
	//등록
	//수정
	//삭제
}
