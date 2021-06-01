import kr.tpc.Dbconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
	// 인터페이스만 알면,
	// driver class를 모르고도 그 클래스에 접근할 수 있다.

	public static void main(String[] args) {
		
		// Oracle, Mysql -> driver class
		 Dbconnect conn = new JavaOracle();
		 conn.getConnection("url", "bit", "12345");
		 
		 conn = new JavaMySQL();
		 conn.getConnection("url", "root", "56789");
	}

}
