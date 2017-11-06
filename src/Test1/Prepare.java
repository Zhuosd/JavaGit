package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;


public class Prepare {
    private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver" ;
    private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:zsdorcl" ;
    private static final String USER = "scott" ;
    private static final String PASSWORD = "tiger" ;
    public static void main(String[] args) throws Exception {
        String name = "Mr'SMITH" ;				// 增加的name数据
        Date birthday = new Date() ;				// 增加的birthday数据，使用java.util.Date
        int age = 18 ;						// 增加的age数据
        String note = "www.yootk.com" ;			// 增加的note数据
        Class.forName(DBDRIVER) ;					// 加载驱动程序
        Connection conn = DriverManager.getConnection(DBURL, USER, PASSWORD) ;	// 连接数据库
        String sql = " INSERT INTO memeber(mid,name,birthday,age,note) VALUES " 
               + " (myseq.nextval,?,?,?,?)";		// 使用占位符设置预处理数据
        PreparedStatement pstmt = conn.prepareStatement(sql) ;
        pstmt.setString(1, name);				// 设置第1个占位符“？”
        pstmt.setDate(2, new java.sql.Date(
                birthday.getTime()));			// 设置第2个占位符“？”
        pstmt.setInt(3, age);					// 设置第3个占位符“？”
        pstmt.setString(4, note);				// 设置第4个占位符“？”
        int len = pstmt.executeUpdate() ;			// 执行SQL返回更新的数据行
        System.out.println("影响的数据行：" + len);
        conn.close();							// 关闭数据库连接
    }

}
