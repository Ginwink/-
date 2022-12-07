package Build_Thread;

public class demo1 {
    public static void main(String[] args) {
        Thread_demo td = new Thread_demo();

        Thread thread1 = new Thread(td, "张三");
        Thread thread2 = new Thread(td, "李四");


        thread1.start();
        thread2.start();

    }
}
