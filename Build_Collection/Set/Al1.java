package Build_Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Al1 {
    public static void main(String[] args) {
        HashSet<Stu_al1> hashSet = new HashSet<Stu_al1>();

        Stu_al1 stu1 = new Stu_al1("wink", 18);
        Stu_al1 stu2 = new Stu_al1("sweet", 19);
        Stu_al1 stu3 = new Stu_al1("kin", 19);

        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);

        Iterator<Stu_al1> it = hashSet.iterator();

        while (it.hasNext())
        {
            Stu_al1 s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        //
        for (Stu_al1 s : hashSet) {
            System.out.println(s.getAge() + "," + s.getName());
        }

    }
}
