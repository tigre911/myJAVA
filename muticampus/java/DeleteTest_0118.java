import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteTest {
	Scanner scan = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public DeleteTest() {
		
	}
	public void start() {
		try {
			//사원번호를 입력받아 입력받은 사원을 삭제한다.
			System.out.println("삭제할 사원번호를 입력하세요.");
			int no = Integer.parseInt(scan.nextLine());	//사원번호
			
			// 1. 드라이브로딩
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        // 2. db연결
			String url = "jdbc:mysql://localhost:3307/demo";
			conn = DriverManager.getConnection(url, "root", "0000");
	        // 3. 쿼리문 작성 (물음표가 2개있는 쿼리문)
			String sql = "DELETE FROM emp WHERE empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			// 4. 실행
			int cnt = pstmt.executeUpdate();
			
			if (cnt>0) {
				System.out.println(cnt + "개의 레코드가 삭제되었습니다.");
			}else{
				System.out.println("레코드 삭제 실패!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) { pstmt.close(); }
				if (conn != null) { conn.close(); }
			}catch (Exception e2) { e2.printStackTrace(); }
		}
	
	}
	
	public static void main(String[] args) {
		new DeleteTest().start();
	}
	
}
