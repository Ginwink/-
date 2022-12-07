package Build_Thread;

public class Thread_demo implements Runnable {
    private Integer cunt = 0;

    /*
     * 编写一个模拟银行存款的程序，假设有两个储户都去银行往同一个账户存款，一次存入100元，没人存3次，要求储户每存一次钱，增户余额增加100，并在控制台输出当前账户的余额。*/
    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {

            cunt += 100;

            System.out.println(Thread.currentThread().getName()+"余额为：" + cunt);
        }
    }

}

