package Build_fan_xing;

/*
测试类
 */
public class Generic_demo {
    public static void main(String[] args) {
        Student_demo stu_demo = new Student_demo();

            stu_demo.setName("wink");
            System.out.println(stu_demo.getName());
        Teacher_demo tea_demo = new Teacher_demo();
            tea_demo.setAge(18);
        System.out.println(tea_demo.getAge());
        System.out.println("==================");

        Generic<String> g1 = new Generic<String>();

        g1.setT("sweet");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();

        g2.setT(18);
        System.out.println(g2.getT());
    }
}
