package day08;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-11-08 15:09
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.UUID;

public class NewHtml {

    //生成文件路径，采用静态作为存储的变量
    private static String path = "D:\\file";
    //文件路径+名称
    private static String filenameTemp;

    /**
     * 创建文件
     * @param fileName  文件名称
     * @param filecontent   文件内容
     * @return  是否创建成功，成功则返回true
     */
    public static boolean createFile(String fileName,String filecontent){
        Boolean bool = false;
        filenameTemp = path+fileName+".html";//文件路径+名称+文件类型
        //JDK1.8特有的属性
        File file = new File(filenameTemp);
        try {
            //如果文件不存在，则创建新的文件
            if(!file.exists()){
                file.createNewFile();
                bool = true;
                System.out.println("create file it success!!"+filenameTemp);
                //创建文件成功后，写入内容到文件里
                writeFileContent(filenameTemp, filecontent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }

    /**
     * 向文件中写入内容
     * @param filepath 文件路径与名称
     * @param newstr  写入的内容
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{

        Boolean bool = false;
        String filein = newstr+"\r\n";//新写入的行，换行
        String temp  = "";

        FileInputStream fis = null;//文件输入流
        InputStreamReader isr = null;//输入读写流
        BufferedReader br = null;//缓冲区
        FileOutputStream fos  = null;//文件输出流
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//文件路径(包括文件名称)
            //将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            //文件原有内容
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // 行与行之间的分隔符 相当于“\n”
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //需要将开启的输入输出流进行关闭操作
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }

    /**
     * 删除文件
//     * @param fileName 文件名称
     * @return
     *//*
    public static boolean delFile(String fileName){
        Boolean bool = false;
        filenameTemp = path+fileName+".txt";
        File file  = new File(filenameTemp);
        try {
            if(file.exists()){
                file.delete();
                bool = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }*/
    public static void main(String[] args) {
        /*
        * UUID采用随机数的存储
        * */
        UUID uuid = UUID.randomUUID();
        createFile(uuid+"myfile", "<html >\n" +
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
                "</html>");
    }
}