package Build_IOliu.Build_File;

import java.io.File;
import java.io.IOException;


/*
* File类创建目录
* */
public class File_demo2 {
        public static void main(String[] args) throws IOException {
//            createNewFile() 当该文件不存在时创建该路径命名的空*文件* *返回值boolean
        File f1 = new File("D:\\learning\\en\\src");
        System.out.println(f1.createNewFile());

//             mkdir() 创建目录
        File f2 = new File("D:\\learning\\en\\src");
            System.out.println(f2.mkdir());

//          创建多级目录 自动补齐
            File f3 = new File("D:\\learning\\en\\src");
            System.out.println(f3.mkdirs());

//
        }
}
