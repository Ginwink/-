package Build_yi_chang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) {
        show();
    }
    /*
        运行时异常:
        无需显示处理,也可以和编译时异常一样处理

    */

    /*
        编译时异常:
        必须显示处理,无法编译
    */
    public static void show()
    {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException:
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    //=============================================
    public static void show2()
    {
        try {
            String s = "2022-7-4";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(s);
            System.out.println(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

}
