package Build_Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
List:
    特点:有序,可重复
 */
public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("word");
        list.add("java");

        list.add("hello");
        list.add("word");
        list.add("java");
        //        System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext())
        {
            String s = it.next();
            System.out.println(s);
        }

    }
}
