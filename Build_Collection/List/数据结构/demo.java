package Build_Collection.List.数据结构;

import java.util.Iterator;
import java.util.LinkedList;

/*
ArrayList
linkedList
 */
public class demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("李嘉图");
        linkedList.add("楚子航");

        Iterator<String> it = linkedList.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
