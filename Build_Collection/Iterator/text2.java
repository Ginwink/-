package Build_Collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Collection集合遍历：
    iterator:集合专用迭代
        next();     返回下一个元素
        hasNext();  迭代多个元素,返回true
 */
public class text2 {
    public static void main(String[] args) {
        Collection<String> ct = new ArrayList<String>();

        ct.add("java");
        ct.add("hello");
        ct.add("word");
//      返回集合中的迭代器
        Iterator<String> it = ct.iterator();
//      用while循环迭代
        while (it.hasNext())
        {
            //it.next();
            System.out.println(it.next());
//            String s = it.next();
//            System.out.println(s);
        }
    }
}
