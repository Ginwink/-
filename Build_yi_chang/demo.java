package Build_yi_chang;
/*
                        Throwable
                            |
          ------------------ -------------------
        Error                           Exception
                                            |
                                      ------ -------
                           RuntimeException     非RuntimeException
    Error: 严重问题,不需要处理
    Exception: 异常类,它表示程序本身可以处理的问题
    RuntimeException： 编译不报错,要修改代码
    RuntimeException：编译报错,不能运行
 */
public class demo {
    public static void main(String[] args)
    {
        //异常处理      tyr{ }catch{ }
        System.out.println("开始");
        show();
        System.out.println("结束");
    }
    public static void show()
    {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("越界");
            e.printStackTrace();
        }
    }
}
