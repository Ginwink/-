package Build_IOliu.Build_File;

import java.io.*;

/*
 * 基本字节流字节读写
 * 基本字节流数组读写
 * 字节缓冲流字节读写
 * 字节缓冲流数组读写
 * */
public class method_demo {

    public static void main(String[] args) {

        long starTime = System.currentTimeMillis();


        long endTime = System.currentTimeMillis();
//    输出耗时
        System.out.println("耗时" + (starTime - endTime) + "毫秒");

    }


    public static void method_one() throws IOException {//基本字节流字节读写
//输入
        FileInputStream fis = new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");
//输出
        FileOutputStream fos = new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");

        int value;
//        while ((value = fis.read()) != -1) {
//            fos.write(value);
//        }
        fis.close();
        fos.close();

    }


    public static void method_two() throws IOException {//基本字节流数组读写

//  输入
        FileInputStream fis = new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");
//  输出
        FileOutputStream fos = new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {

            fos.write(bys, 0, len);

        }
        fis.close();
        fos.close();
    }


    public static void method_there() throws IOException {//字节缓冲流字节读写

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt"));

        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();

    }


    public static void method_four() throws IOException{//字节缓冲流数组读写

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1  ){

            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }

}
