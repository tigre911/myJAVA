package com.our.service;

import java.util.List;
import java.util.Scanner;

import com.our.dao.BookDao;
import com.our.dto.BookDto;

public class BookService {
	BookDao bookDao = new BookDao();
	Scanner scanner =new Scanner(System.in);
	public void showBookList() {
		System.out.println("[BookService]:::showBookList()");
		BookDao bookDao = new BookDao();
		List<BookDto> list = bookDao.selectBook();
		for (int i = 0; i < list.size(); i++) {
			selectBook(list.get(i));
		}
		
	}
	
	public void selectBook(BookDto dto) {
		System.out.printf("%10s %10s %10s %10d %5d %10S \n",
				 dto.getBookNo(),
				 dto.getBookTitle(),
				 dto.getBookAuthor(),
				 dto.getBookYear(),
				 dto.getBookPrice(),
				 dto.getBookPublisher());
	}

	public void insertBook() {
		
		BookDto bookDto = new BookDto();
		
		System.out.println("책 번호 :");
		bookDto.setBookNo(scanner.nextLine());
		System.out.println("책 이름 :");
		bookDto.setBookTitle(scanner.nextLine());
		System.out.println("책 저자 :");
		bookDto.setBookAuthor(scanner.nextLine());
		System.out.println("책 발행년도 :");
		bookDto.setBookYear(scanner.nextInt());
		System.out.println("책 가격 :");
		bookDto.setBookPrice(scanner.nextInt());
		scanner.nextLine();
		System.out.println("책 출판사 :");
		bookDto.setBookPublisher(scanner.nextLine());
		
		BookDao bookDao = new BookDao();
		int result = bookDao.insertBook(bookDto);
		if (result>0) {
			System.out.println("책 등록 완료");
		}else {
			System.out.println("등록 실패");
		}
		
	}

	public void modifyBook() {
		BookDao bookDao = new BookDao();
		BookDto dto = new BookDto();
		
		System.out.println("수정할 책의 번호 : ");
		dto.setBookNo(scanner.nextLine());
		System.out.println("수정할 금액 : ");
		dto.setBookPrice(scanner.nextInt());
		
		int count = bookDao.updateBook(dto);
		if (count>0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
	}

	public void deleteBook() {
		BookDao bookDao = new BookDao();
		String deleteNum = scanner.nextLine();
		System.out.println("삭제할 도서 번호 입력 :");
		int result = bookDao.deleteBook(deleteNum);
		
		if (result > 0) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
		
	}
	
}
