package Build_Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
 TreeSet:
 比较器排序Comparator
    自动排序

 */
public class TerrSet_demo2 {
    public static void main(String[] args) {
        TreeSet<Stu> ts = new TreeSet<Stu>(new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });
        Stu stu1 = new Stu("wink", 18);
        Stu stu2 = new Stu("sweet", 19);
        Stu stu3 = new Stu("kin", 19);
        //
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);

        for (Stu stu : ts) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
