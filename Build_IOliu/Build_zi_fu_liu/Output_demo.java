package Build_IOliu.Build_zi_fu_liu;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
* 字符流写数据
* */
public class Output_demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\learning"));

//       写数据
        osw.write(97);
//        刷新流,可继续写数据
        osw.flush();

//      写字符数组
        char[] chs = {'a','b','c'};
        osw.write(chs,0,chs.length);

//       写字符串
        osw.write("abcd");
        osw.write("abc",0,"abc".length());


//        关闭流，先刷新
        osw.close();
    }

}
