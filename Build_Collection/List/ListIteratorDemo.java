package Build_Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
ListIterator:列表迭代器
     List集合的iterator()方法得到,特有的迭代器
     *能从任意方向遍历、添加列表、获取当前位置
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        /*
        常用方法
         */
        //正向
        list.add("hello");
        list.add("word");
        list.add("java");
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext())
        {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("================");

        //逆向
        while(lit.hasPrevious())
        {
            String s = lit.previous();
            System.out.println(s);
        }
        System.out.println("================");

        //添加
        while (lit.hasNext())
        {

            String s = lit.next();

            if (s.equals("word")) {
                lit.add("wink");
            }
            System.out.println(list);
        }
//        System.out.println(list);

    }
}
