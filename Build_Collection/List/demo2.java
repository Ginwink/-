package Build_Collection.List;

import java.util.ArrayList;
import java.util.List;

/*
List 特有方法:
 */
public class demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("word");
        list.add("java");

        //遍历
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            System.out.println(s);

        }
        System.out.println("***************************");
        //指定位置添加
        list.add(1,"wink");
        System.out.println(list);
        System.out.println("===");

        //指定位置删除,返回被删除元素
        list.remove(1);
        System.out.println(list);
        System.out.println("===================");
        System.out.println(list.remove(2));

        //修改指定位置元素,返回被修改元素
        System.out.println(list);
        System.out.println(list.set(0,"aa"));
        System.out.println(list);
        System.out.println("===================");

        //返回指定索引元素
        System.out.println(list.get(1));

    }
}
