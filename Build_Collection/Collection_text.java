package Build_Collection;

import java.util.ArrayList;
import java.util.Collection;
/*
Collection常用方法
 */
public class Collection_text {
    public static void main(String[] args) {
        Collection<String>  c = new ArrayList<String>();
        //添加方法 add(E e);
        c.add("hello");
        c.add("word");
        System.out.println(c);
        System.out.println("===");

        //删除方法remove();
        c.remove("java");
        System.out.println(c);
        System.out.println("===");

        //判断存在方法contains();
        System.out.println(c.contains("java"));
        System.out.println("===");

        //清空方法clear();
        c.clear();
        System.out.println(c);
        System.out.println("===");

        //判断是否为空isEmpty();
        System.out.println(c.isEmpty());
        System.out.println("===");

        //判断大小size();
        System.out.println(c.size());
    }
}
