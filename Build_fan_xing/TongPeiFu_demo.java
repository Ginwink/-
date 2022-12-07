package Build_fan_xing;

import java.util.ArrayList;
import java.util.List;
/*
通配符
 */
public class TongPeiFu_demo {
    public static void main(String[] args) {
        //<?>
        List<?> list = new ArrayList<Object>();
        List<?> list1 = new ArrayList<Number>();
        List<?> list2 = new ArrayList<Integer>();
        //<? extends ?>上限
        List<? extends Number> list3 = new ArrayList<Number>();
        List<? extends Number> list4 = new ArrayList<Integer>();
        //<? super ?> 下限
        List<? super Object> list5 = new ArrayList<Object>();
        List<? super Number> list6 = new ArrayList<Number>();
        List<? super Number> list7 = new ArrayList<Object>();

    }
}
