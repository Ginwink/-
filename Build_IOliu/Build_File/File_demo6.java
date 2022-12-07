package Build_IOliu.Build_File;


import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节流写数据加入异常处理*/
public class File_demo6 {
    public static void main(String[] args){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {  //finally实现释放资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
