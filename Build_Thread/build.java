package Build_Thread;

public class build {
    /*
    * 线程获取name参数：.setName();
    * 带参 ： 继承线程类 调用getName方法，用super访问父类Name。public 子类 (String name){super(name);}
    *  返回此线程的优先级：.getPriority();
    * 更改优先级：setPriority(i);i=(1-10)
    * 线程类：线程暂停：.sleep(int i);*捕获异常
    * 等待线程结束：.join();*捕获异常
    * 获得执行线程: Thread.currentThread();
    * 设主线程：Thread.currentThread();
    * 设守护线程：setDaemon(true)*/

    /*
    * 线程实现方法二：
    * 自定义类实现Runnable接口，测试类创建Thread对象，把实现接口对象作为参数
    * Thread thread = new Thread(Runnable target,String name);
    * */
    /*
    * 数据安全环境问题：
    * 是否是多线程环境
    * 是否有共享数据
    * 是否有多条语句操作共享数据的多条语句
    *
    * 解决办法：
    * 把操作共享数据的多条语句锁起来，任意时刻只能有一个线程执行
    * Java同步代码块：
    *   synchronized(对象){
    *       操作共享数据的多条语句
    *   }
    * */
    /*
    * 线程安全类：
    * StringBuffer
    * Vector:   Collections.synchronizedList(new ArrayList<>());
    * Hashtable:    Collections.synchronizedMap(new HashMap<>());
    * Set:     Collections.synchronizedSet(new TreeSet<>());
    * */

    /*
    * lock锁：
    * private Lock lock = new ReentrantLock();
    * 使用try{    lock.lock();    }finally{   lock.unlock;    }   代码块
    * */
}
