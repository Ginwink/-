package Build_Collection.Map.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collections_demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(06);
        list.add(10);
        list.add(11);
        list.add(22);
//        升序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("+++++++++++");

//        反转指定列表中的元素
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("============");

//        随机排列
        Collections.shuffle(list);
        System.out.println(list);
    }
}
