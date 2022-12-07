package Build_Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set集合特点:
    元素不重复、不能使用for循环遍历(无带索引方法)
 hasNext():无序
 */
public class Set_demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("wink");
        set.add("Sweetie");
        set.add("kin");

        for (String s : set){
            System.out.println(s);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s =  iterator.next();
            System.out.println(s);
        }
    }
}
