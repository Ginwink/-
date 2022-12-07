package Build_IOliu.Build_zi_fu_liu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Random;

/*
* 点名器
* */
public class Al_demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\learning\\names.txt"));

        ArrayList<String> al = new ArrayList<String>();

        String line;

        while ((line = br.readLine()) != null){
            al.add(line);

        }


        br.close();


        Random rd = new Random();
        int index = rd.nextInt(al.size());

        String name = al.get(index);

        System.out.println("幸运者："+ name);
    }
}
