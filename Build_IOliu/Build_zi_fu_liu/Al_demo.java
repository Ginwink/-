package Build_IOliu.Build_zi_fu_liu;


import java.io.*;
import java.util.ArrayList;
/*
集合到文件
* */
public class Al_demo {
    public static void main(String[] args) throws IOException{
        ArrayList<String> al = new ArrayList<String>();

        al.add("路明非");
        al.add("楚子航");
        al.add("凯撒");

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\learning\\text.txt"));

        for (String s : al){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }


        bw.close();
    }
}
