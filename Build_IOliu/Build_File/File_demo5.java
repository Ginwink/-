package Build_IOliu.Build_File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*字节流写数据
* 输入流用于数据写入
* FileOutputStream(String name)
* */
public class File_demo5 {
    public static void main(String[] args) throws IOException {
//        第二个参数为 true ,则字节写在文件末尾
        FileOutputStream fos = new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\Build_File\\fos.txt");
        /*调用系统功能创建文件-创建字节输出流对象-指向创建文件*/
//        void write();指定字节写入
        fos.write(97);
        byte[] by = "abcde".getBytes();
//
        fos.write(by);
//      将数组从off位置输出len字节
        fos.write(by,1,3);

//      换行  Windows:\r\n    linux:\n    mac:\r
        for (int i = 0; i < 10; i++){
            fos.write(by);
            fos.write("\r\n".getBytes());
        }
//      追加写入数据
//      释放资源
//        void close关闭此文件输出流释放系统资源
        fos.close();

    }
}
