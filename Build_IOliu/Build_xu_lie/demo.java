package Build_IOliu.Build_xu_lie;

import java.io.*;

/*
 * 序列化
 * 需要实现Serializable接口*/

//***给所属的类加 private static final long serialVersionUID = 42L;

public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        write();

        read();

    }

//  反序列化
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\learning\\en\\src\\Build_IOliu\\oos.txt"));

        Object obj = ois.readObject();

        Student stu = (Student) obj;

        System.out.println(stu.getName() + stu.getId());

        ois.close();
    }

    //    序列化
    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\learning\\en\\src\\Build_IOliu\\oos.txt"));

        Student stu = new Student("路明非", 21305);

        oos.writeObject(stu);

        oos.close();
    }
}
















