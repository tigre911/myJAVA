package com.campus.myapp.vo;

public class PagingVO {
	//페이징
	private int onePageRecord = 5;//한페이지당 출력할 레코드수
	private int pageNum = 1;//현재페이지
	private int totalRecord;//총레코드수
	private int totalPage;//총페이지수
	private int offsetIndex;
	//검색
	public int getOnePageRecord() {
		return onePageRecord;
	}
	public void setOnePageRecord(int onePageRecord) {
		this.onePageRecord = onePageRecord;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
		//offset위치계산
		offsetIndex = (pageNum-1)*onePageRecord;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		
		//총 페이지수
		if(totalRecord%onePageRecord==0) {
			totalPage = totalRecord/onePageRecord;
		}else {//나머지 레코드가 있을 때
			totalPage = totalRecord/onePageRecord + 1;	
		}
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getOffsetIndex() {
		return offsetIndex;
	}
	public void setOffsetIndex(int offsetIndex) {
		this.offsetIndex = offsetIndex;
	}
	
	
}
