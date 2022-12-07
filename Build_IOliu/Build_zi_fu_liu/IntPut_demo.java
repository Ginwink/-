package Build_IOliu.Build_zi_fu_liu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 字符读数据
* */
public class IntPut_demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\learning"));

        char[] chs = new char[1024];
        int value;

        while((value = isr.read(chs)) != -1){ 
            System.out.println(new String(chs,0,value));
        }

        int ch;
        while((ch = isr.read()) != -1){
            System.out.println( (char)ch );
        }


        isr.close();
    }
}
