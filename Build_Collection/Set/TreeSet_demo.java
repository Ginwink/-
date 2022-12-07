package Build_Collection.Set;

import java.util.TreeSet;

/*

TreeSet特点:
    规则排序、排序取决于构造方法
    元素唯一
    无带索引方法
 */
public class TreeSet_demo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(110);
        ts.add(120);
        ts.add(119);

        for (Integer i : ts){
            System.out.println(i);
        }

    }
}
