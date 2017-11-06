package Test1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inquire {
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
		//在编写SQL过程中，如果太长需要增加换行，一定要在前后加上空格。
		String sql = "select mid,name,age,birthday,note from memeber";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			int mid = rs.getInt("mid");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			Date birthday = rs.getDate("birthday");
			String note = rs.getString("note");
			System.out.println(mid + "," + name + "," + age + "," + birthday + "," + note);
		}
		//关闭数据库
		rs.close();
		stmt.close();//可选的
		conn.close();
	}
}
