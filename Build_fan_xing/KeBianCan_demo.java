package Build_fan_xing;
/*
    变量是数组
    多个参数,可变参数放最后
 */
public class KeBianCan_demo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
    }

    public static Integer sum(Integer b,Integer... a) {
        Integer sum = 0;
        for (Integer i : a) {
            sum += i;
        }
        return sum;
    }
}
