package Build_IOliu.Build_File;

import java.io.File;

/*
* File类判断和获取
* */
public class File_demo3 {
    public static void main(String[] args) {
        File file = new File("D:\\learning\\en\\java_File");
//        判断抽象路径是否为目录isDirectory()
        System.out.println(file.isDirectory());

//        判断抽象路径是否为文件isFile()
        System.out.println(file.isFile());

//        判断抽象路径名是否存在exists()
        System.out.println(file.exists());

//        返回抽象路径名的绝对路径字符串getAbsolutePath()
        System.out.println(file.getAbsolutePath());

//        将抽象路径名转换为绝对路径名字符串getPath()
        System.out.println(file.getPath());

//        返回抽象路径名表示的目录或文件名getName()
        System.out.println(file.getName());


        File file1 = new File("D:\\learning\\en\\src");
//        返回抽象路径名表示的目录中的目录和文件名字符串数组list()
        String[] strings = file1.list();
        for (String value : strings){
            System.out.println(value);
        }
//        返回抽象路径名表示的目录中的目录和文件的File对像数组
 /*返回是文件的File数组
 * */
        File[] listFiles = file1.listFiles();
        for (File value : listFiles){
            if (value.isFile()){
                System.out.println(value.getName());
            }
        }
    }
}
