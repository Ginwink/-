package Build_IOliu.Build_File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*字节流读取数据*/
public class File_demo8 {
    public static void main(String[] args) throws IOException {
        /*
        * 换图片：改变输入输出路径*/
        FileInputStream fis = new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");

        //        FileOutputStream fos = new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");
        byte[] bys = new byte[1024];
        int len;

        /*
        while ((len = fis.read()) != -1){
            System.out.println(bys,0,len);
        }
*/
        while ((len = fis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
        fis.close();


//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt"));
        /*BufferStream 字节缓冲输出流：字节输出和数组输出 方法同*/
    }
}
