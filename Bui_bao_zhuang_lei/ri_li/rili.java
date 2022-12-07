package Bui_bao_zhuang_lei;

import java.util.Calendar;

public class rili {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //get 返回给定字段的值
        /*
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println( year+"年" + month+"月" + date+"日");
        */

        //常用方法

        //根据日历，将指定的时间增删
        //public abstract void add(int field , int amount);
        c.add(Calendar.YEAR,0);
        c.add(Calendar.DATE,0);
/*
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println( year+"年" + month+"月" + date+"日");
 */
        //设置当前日历时间
        //public final void set(int year, int month, int date);
        c.set(2003,6,20);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println( year+"年" + month+"月" + date+"日");

    }
}
