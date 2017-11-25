package day08;


import java.io.*;

/**
 * 描述:
 * 文件读写
 *
 * @outhor 71948
 * @create 2017-11-08 15:22
 */
public class FileWriter1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        fw = new FileWriter("d:/test.html");
        long begin3 = System.currentTimeMillis();
        fw.write("<html >\n" +
                "\t<head>\n" +
                "\t<title>2的幂方（0~9）的表格</title>\n" +
                "\t</head>\n" +
                "<body>\n" +
                "\t<script language=\"javascript\">\n" +
                "\tvar temp=\"<table width='200' border='0' cellspacing='1'" +
                " cellpadding='5' bgcolor='#000000'>" +
                "<tr><td bgcolor='#FFFFFF'>Power of 2</td>" +
                "<td bgcolor='#FFFFFF'>Value</td></tr>\"\n" +
                "\tfor(i=0;i<10;i++){\n" +
                "\t\ttemp+=\"<tr><td bgcolor='#FFFFFF'>\"+i+\"</td><td bgcolor='#FFFFFF'>\"" +
                "+Math.pow(2,i)+\"</td></tr>\"\n" +
                "\t}\n" +
                "\ttemp+=\"</table>\"\n" +
                "\tdocument.write(temp)\n" +
                "\t</script>\n" +
                "\t</applet>\n" +
                "</body>\n" +
                "</html>");
        long end3 = System.currentTimeMillis();
        System.out.println(end3-begin3);
        fw.close();


        FileOutputStream out = null;
        out = new FileOutputStream(new File("D:/FileOutputStream.html"));
        long begin = System.currentTimeMillis();
        out.write(Integer.parseInt("<html >\n" +
                "\t<head>\n" +
                "\t<title>2的幂方（0~9）的表格</title>\n" +
                "\t</head>\n" +
                "<body>\n" +
                "\t<script language=\"javascript\">\n" +
                "\tvar temp=\"<table width='200' border='0' cellspacing='1' cellpadding='5' bgcolor='#000000'><tr><td bgcolor='#FFFFFF'>Power of 2</td><td bgcolor='#FFFFFF'>Value</td></tr>\"\n" +
                "\tfor(i=0;i<10;i++){\n" +
                "\t\ttemp+=\"<tr><td bgcolor='#FFFFFF'>\"+i+\"</td><td bgcolor='#FFFFFF'>\"+Math.pow(2,i)+\"</td></tr>\"\n" +
                "\t}\n" +
                "\ttemp+=\"</table>\"\n" +
                "\tdocument.write(temp)\n" +
                "\t</script>\n" +
                "\t</applet>\n" +
                "</body>\n" +
                "</html>"));
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
        out.close();



        FileOutputStream outStr = null;
        BufferedOutputStream Buff=null;
        Buff = new BufferedOutputStream(outStr);
        long begin1 = System.currentTimeMillis();
        Buff.write(Integer.parseInt("<html >\n" +
                "\t<head>\n" +
                "\t<title>2的幂方（0~9）的表格</title>\n" +
                "\t</head>\n" +
                "<body>\n" +
                "\t<script language=\"javascript\">\n" +
                "\tvar temp=\"<table width='200' border='0' cellspacing='1' cellpadding='5' bgcolor='#000000'><tr><td bgcolor='#FFFFFF'>Power of 2</td><td bgcolor='#FFFFFF'>Value</td></tr>\"\n" +
                "\tfor(i=0;i<10;i++){\n" +
                "\t\ttemp+=\"<tr><td bgcolor='#FFFFFF'>\"+i+\"</td><td bgcolor='#FFFFFF'>\"+Math.pow(2,i)+\"</td></tr>\"\n" +
                "\t}\n" +
                "\ttemp+=\"</table>\"\n" +
                "\tdocument.write(temp)\n" +
                "\t</script>\n" +
                "\t</applet>\n" +
                "</body>\n" +
                "</html>"));
        long end1 = System.currentTimeMillis();
        System.out.println(end1-begin1);
        Buff.close();
    }
}