package Build_Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SplittableRandom;

/*
增强for循环
    内部是Iterator循环
 */
public class For_demo {
    public static void main(String[] args) {
//      整形数组
        int [] arr = {1,2,3,4,5};

        for (int i : arr)
        {
            System.out.println(i);
        }
        System.out.println("=======================");
//      字符数组
        String []str = {"路明非","楚子航","凯撒"};

        for (String s : str)
        {
            System.out.println(s);
        }
        System.out.println("===========");
//
        List<String> list = new ArrayList<String>();
        list.add("路明非");
        list.add("楚子航");
        for (String s : list){
            System.out.println(s);
        }
    }
}
