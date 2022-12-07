package Build_IOliu.Build_zi_fu_liu;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
* 文件到集合
* */
public class Al_demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\learning\\text.txt"));

        ArrayList<String> al = new ArrayList<String>();

        String line;

        while ((line = br.readLine()) != null){
            al.add(line);
        }

        br.close();


        for (String s : al){
            System.out.println(s);
        }
    }
}
