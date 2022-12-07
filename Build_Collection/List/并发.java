package Build_Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
ConcurrentModificationException
并发修改异常:
    迭代器遍历的过程中,通过集合对象修改集合中的长度,造成迭代器获取元素中判断预期修
    改值和实际修改值不一致
 */
public class 并发 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("路明非");
        list.add("楚子航");
        list.add("凯撒");

        Iterator<String> it = list.iterator();

        while (it.hasNext())
        {
            String s = it.next();
//            System.out.println(s);
            //
            if (s.equals("路明非"))
            {
                list.add("小魔女");
            }
        }
        System.out.println(list);
    }
}
