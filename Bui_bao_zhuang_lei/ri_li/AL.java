package Bui_bao_zhuang_lei.ri_li;

import java.util.Calendar;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        //输入任意年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1);

        //
        calendar.add(calendar.DATE,-1);

        //
        int date = calendar.get(calendar.DATE);
        System.out.println(year+"年的二月有" + date +"天");
    }
}
