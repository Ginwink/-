package Build_yi_chang;
/*
    throws 异常类名:  跟在括号后

 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo_throws {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            show2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    public static void show2() throws ParseException {
        String s = "2022-7-4";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        System.out.println(date);
    }

}
