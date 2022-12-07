package Build_IOliu.Build_xu_lie;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
/*
* properties和IO流结合方法
* */
public class propFile_demo {
    public static void main(String[] args) throws IOException {
//      集合数据保存到文件
        myStore();
//      文件加载到集合
        myload();
    }

    private static void myload() throws IOException{
        Properties prop = new Properties();

        FileReader fr = new FileReader("D:\\learning\\en\\src\\Build_IOliu\\prop.txt");

        prop.load(fr);

        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("001","路明非");
        prop.setProperty("002","楚子航");
        prop.setProperty("003","凯撒");

        FileWriter fw = new FileWriter("D:\\learning\\en\\src\\Build_IOliu\\prop.txt");

        prop.store(fw,null);

        fw.close();
    }


}
