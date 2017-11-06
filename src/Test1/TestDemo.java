package Test1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestDemo {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBUR = "jdbc:oracle:thin:@localhost:1521:zsdorcl";
	public static final String USER="scott";
	public static final String PASSWORD = "tiger";
	public static void main(String[] args) throws Exception {
		//第一步；记载数据库驱动程序，此时不需要实例化，因为由容器自己负责管理
		Class.forName(DBDRIVER);
		//第二步：连接数据库
		Connection conn = DriverManager.getConnection(DBUR,USER,PASSWORD);
		System.out.println(conn);
		//第三步：进行数据库的连接
		Statement  stmt = conn.createStatement();
		String sql = " INSERT INTO memeber(mid,name,birthday,age,note) VALUES "
	            + " (myseq.nextval,'优拓',TO_DATE('1987-09-15','yyyy-mm-dd'),17,'www.yootk.com')" ;
		int len = stmt.executeUpdate(sql);
		System.out.println("影响数据库的行数" + len);
		//关闭数据库
		stmt.close();//可选的
		conn.close();
	}
}
