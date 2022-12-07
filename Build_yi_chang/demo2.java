package Build_yi_chang;
/*
    Throwable 是所有错误和异常的祖宗类
 */
public class demo2 {
    public static void main(String[] args) {

            System.out.println("开始");
            show();
            System.out.println("结束");
        }
        public static void show()
        {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException();
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
            //getMessage 返回异常原因 
        }
    }
