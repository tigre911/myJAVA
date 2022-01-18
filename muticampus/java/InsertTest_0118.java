import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public InsertTest() {
		
	}
	public void empInsert() {
//		사원번호, 이름, 급여, 입사일을 레코드 추가하기

		try {
//			1. 드라이브 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. DB 연결
			String url = "jdbc:mysql://localhost:3307/demo";
			conn = DriverManager.getConnection(url, "root", "0000");
			
//			3. preparedStatement 객체 생성 : 쿼리문을 이용하여
//			사원번호 : 5555, 이름 : kim, 급여 : 4500, 입사일 : 현재 날짜와 시간으로 설정
			String sql = "INSERT INTO emp(empno, ename, sal, hiredate) VALUES(?, ?, ?, NOW())";
			pstmt = conn.prepareStatement(sql);
			
//			?에 값을 세팅한다.
			pstmt.setInt(1, 5555);		//1번째 물음표에 5555를 셋한다.
			pstmt.setString(2, "kim");	//2번째 물음표에 kim 을 셋한다.
			pstmt.setDouble(3, 3500);
			
//			4. 실행
//			쿼리문을 실행하여 추가 된 레코드의 수를 반환한다.
			int cnt = pstmt.executeUpdate();
			
			if (cnt>0) {
				System.out.println("레코드가 추가 되었습니다.");
			}else {
				System.out.println("레코드 추가 실패했습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) { pstmt.close(); }
				if (conn != null) { conn.close(); }
			}catch (Exception e2) { e2.printStackTrace(); }
		}
	}
	
	public static void main(String[] args) {
		new InsertTest().empInsert();
	}
}
