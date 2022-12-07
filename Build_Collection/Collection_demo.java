package Build_Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection: 多态
            ArrayList();
 */
public class Collection_demo {
    public static void main(String[] args) {
        //创建对象
        Collection<String> ct = new ArrayList<String>();
        //添加  boolean  add(E e);
        ct.add("hello");
        ct.add("word");
        System.out.println(ct);//ArrayList重写了ToString方法
    }
}
