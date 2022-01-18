import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UdateTest {

	Scanner scup = new Scanner(System.in);

	public UdateTest() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		//   사원번호와 급여를 입력받아 해당사원의 급여를 수정하는 프로그램
		//   데이터 입력
		System.out.print("수정할 사원 번호 : ");
		int empno = scup.nextInt();
		System.out.println("수정할 급여 :");
		int sal = scup.nextInt();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//   1. 드라이브로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//   2. db연결
			String url = "jdbc:mysql://localhost:3307/demo";
			conn = DriverManager.getConnection(url, "root", "0000");
			//   3. 쿼리문 작성 (물음표가 2개있는 쿼리문)
			//                        1            2
			String sql = "UPDATE emp SET sal=? WHERE empno=?";
			pstmt = conn.prepareStatement(sql);
			//   3-1 : 필요데이터 셋팅
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);

			//   4.실행
			int result = pstmt.executeUpdate();

			if(result >0 ){
				System.out.println(result +"개의 레코드가 수정되었습니다.");
			}else {
				System.out.println("수정한 레코드가 없습니다.");
			}


		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//   5. db close
			try {
				if(pstmt != null)   pstmt.close();
				if(conn != null)   conn.close();
			} catch(Exception e) {}
			//   예외 지정안해줌
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new UdateTest().start();
	}

}