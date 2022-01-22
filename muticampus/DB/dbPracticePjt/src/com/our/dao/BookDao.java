package com.our.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.our.dto.BookDto;

public class BookDao {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void getConn() {
		System.out.println("[BookDao]:::getConn()");
		String url = "jdbc:mysql://localhost:3307/mydb";
		String id ="root";
		String password = "0000";
		
		try {
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dbClose() {
		System.out.println("[BookDao]:::dbClose()");
		try {
			if (rs!=null){rs.close();}
			if (pstmt!=null){pstmt.close();}
			if (conn!=null){conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<BookDto> selectBook() {
		System.out.println("[BookDao]:::selectBook()");
		List<BookDto> list = new ArrayList<BookDto>();
		
		try {
			getConn();
			String sql = "SELECT * FROM tbl_book ORDER BY bookNo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BookDto dto = new BookDto();
				dto.setBookNo(rs.getString(1));
				dto.setBookTitle(rs.getString(2));
				dto.setBookAuthor(rs.getString(3));
				dto.setBookYear(rs.getInt(4));
				dto.setBookPrice(rs.getInt(5));
				dto.setBookPublisher(rs.getString(6));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return list;
	}

	public int insertBook(BookDto	dto) {
		System.out.println("[BookDao]:::insertBook()");
		int result = 0;
		// TODO Auto-generated method stub
		try {
			getConn();
			String sql = "INSERT INTO tbl_book(bookNo, bookTitle, bookAuthor, bookYear ,bookPrice ,bookPublisher) VALUES(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookTitle());
			pstmt.setString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookYear());
			pstmt.setInt(5, dto.getBookPrice());
			pstmt.setString(6, dto.getBookPublisher());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return result;
	}

	public int updateBook(BookDto dto) {
		System.out.println("[BookDao]:::updateBook()");
		int result = 0;
		try {
			getConn();
			String sql = "UPDATE tbl_book SET bookPrice = ? WHERE bookNo = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getBookPrice());
			pstmt.setString(2, dto.getBookNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		return result;
		
	}

	public int deleteBook(String deleteNum) {
		int  result= 0;
		try {
			getConn();
			String sql = "DELETE FROM tbl_book WHERE bookNo = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteNum);
			result = pstmt.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return result;
	}

	

}
