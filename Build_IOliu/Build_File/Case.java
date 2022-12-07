package Build_IOliu.Build_File;

import java.io.File;

public class Case {
    public static void main(String[] args) {
        File srcFile  = new File("D:\\learning\\en");

        getAllPath(srcFile);
    }
    public static void getAllPath(File srcFile){
    File[] files = srcFile.listFiles();

    if (files != null){
        for (File file : files){
            if (file.isDirectory()){
                getAllPath(file);
                System.out.println("===");
            }else {

                System.out.println(file.getAbsolutePath());
            }
        }
    }

    }
}
