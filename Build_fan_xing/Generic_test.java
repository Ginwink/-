package Build_fan_xing;
/*
测试泛型方法
 */
public class Generic_test {
    public static void main(String[] args) {
        Generic_impl<Integer> g = new Generic_impl<Integer>();
        g.show(12);
        System.out.println(g);
        Generic_impl<String> g2 = new Generic_impl<String>();
        g2.show("sweet");
        System.out.println(g2);
    }
}
