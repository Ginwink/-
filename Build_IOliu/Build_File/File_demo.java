package Build_IOliu.Build_File;

import java.io.File;

/*
* File构造方法
* File类重写了ToString方法
* */
public class File_demo {
    public static void main(String[] args) {
//        通过给定的路径名字符串转换为抽象路径名来创建新的File
        File f1 = new File("D:\\learning\\src\\Build_Ioliu");
        System.out.println(f1);
//        从父路径字符串和子路径名字符串创建新的File
        File f2 = new File("D:\\learning\\src","Build_Ioliu");
        System.out.println(f2);

        File f3 = new File("D:\\learning\\src");
        File f4 = new File(f3,"Build_Ioliu");
        System.out.println(f4);
    }
}
