package RequestDemo1;

import java.io.IOException;
/*
*   使用HttpServletRequest获取请求信息
* */
public class RequestDemo1 extends javax.servlet.http.HttpServlet {
    //1、tomcat服务器接受到浏览器发送的请求数据
    //2、tomcat服务器把请求数据封装HtppServletRequest对象
    //3、tomcat服务调用doGet方法
    //4、

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
    //4、通过request对象获取请求数据
        /*请求数据
        * */

        //4.1请求行
            //  请求方式
        System.out.println("请求方式："+request.getMethod());
            //请求资源
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL());
            //http协议版本
        System.out.println("协议"+ request.getProtocol());
        //4.2请求头

        //4.3实体内容
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
