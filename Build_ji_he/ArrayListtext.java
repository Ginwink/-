package Build_ji_he;
/*
案例
 */
import java.util.ArrayList;

public class ArrayListtext{
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("uifiu",18);
        Student s2 = new Student(" ",54);
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
        }
    }
}