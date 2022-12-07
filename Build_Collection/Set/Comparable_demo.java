package Build_Collection.Set;

import java.util.TreeSet;

public class Comparable_demo {
    public static void main(String[] args) {
        TreeSet<Comparable_Stu> ts = new TreeSet<Comparable_Stu>();

        Comparable_Stu stu1 = new Comparable_Stu("wink", 18);
        Comparable_Stu stu2 = new Comparable_Stu("sweet", 19);
        Comparable_Stu stu3 = new Comparable_Stu("kin", 19);
        //
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);

        for (Comparable_Stu com_stu : ts) {
            System.out.println(com_stu.getName() + "," + com_stu.getAge());
        }
    }
}
