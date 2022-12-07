package Build_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
测试类
 */
public class An_Litest {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Stu> ct = new ArrayList<Stu>();
        //
        Stu anLi1 = new Stu("李嘉图",19);
        Stu anLi2 = new Stu("凯撒",19);
        Stu anLi3 = new Stu("李嘉图",19);


        ct.add(anLi1);
        ct.add(anLi2);
        ct.add(anLi3);

        Iterator<Stu> it = ct.iterator();


        while (it.hasNext())
        {
            Stu al = it.next();
            System.out.println(al.getAge()+"岁" + al.getName());
        }


    }
}
