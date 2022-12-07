package Build_IOliu.Build_File;

import java.io.File;
import java.io.IOException;

/*
* File删除
* 目录下有内容不能直接删除
* */
public class file_demo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\learning\\File.txt");
        System.out.println(file.mkdir());
        System.out.println(file.delete());

        File file1 = new File("D:\\learning\\File.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.delete());
    }
}

