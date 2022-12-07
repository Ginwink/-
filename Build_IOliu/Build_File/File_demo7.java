package Build_IOliu.Build_File;

import java.io.FileInputStream;
import java.io.IOException;

/*读取数据（一个字节）*/
public class File_demo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");

        int read = fis.read();
        System.out.println(read);
//      读取不到数据 返回值-1

//        循环读取
        while ((read = fis.read()) != -1){
            System.out.println(read);
        }

        fis.close();
    }
}
