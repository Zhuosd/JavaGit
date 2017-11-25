package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 描述:
 * 解压
 *
 * @outhor 71948
 * @create 2017-11-08 14:01
 */
class Unzip{
    byte doc[] = null;
    String Filename = null;
    String UnzipPath = null;

    public Unzip(String filename,String unzipPath){
        this.Filename = filename;
        this.UnzipPath = unzipPath;

    }
    public Unzip(String filename){
        this.Filename = new String(filename);
        this.UnzipPath=null;

    }

    public void setUnzipPath(String unzipPath) {
        if (unzipPath.endsWith("\\")){
            this.UnzipPath = new String(unzipPath);
        }
        else{
            this.UnzipPath = new String(unzipPath);
        }
    }
    public void doUnZip(){
        try {
            ZipInputStream zipis = new ZipInputStream(new FileInputStream(Filename));
            ZipEntry fEntry = null;
            while((fEntry =zipis.getNextEntry())!=null){
                if(fEntry.isDirectory()){

                }
                else{
                    String fname = new String(UnzipPath+fEntry.getName());
                    doc= new byte[512];
                    int n;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ZipInputStream zipis = null;

    }
}
public class UnzipTest {

}