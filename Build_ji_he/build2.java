package Build_ji_he;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class build2 {
    public static void main(String[] args) {
        //ArrayList学习

        //    可调整大小的数组
        //    < 类型 >

        //构造
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("array:" + array);

        //-----------------------------------------------
        //增至末尾
        array.add("hello");
        array.add("word");
        array.add("java");
        System.out.println("array:" + array);

        //-----------------------------------------------
        //增至指定位置（*索引越界）
        array.add(1, "java");
        System.out.println("array:" + array);

        //==========================================

        //Arraylist常用方法

        //remove    (*删除指定元素，返回删除是否成功，返回被删除元素)
        array.remove(1);
        System.out.println("array:"+array);

        //------------------------------------------------
        //set   (*修改指定元素,返回被修改元素)
        array.set(1,"java");
        System.out.println("array"+array);

        //------------------------------------------------
        //get   (*返回指定索引的元素)
        System.out.println("get:"+array.get(2) );

        //-----------------------------------------------
        //size  (*返回集合中的元素个数)
        System.out.println("size:"+array.size());

        //===============================================
    }
}
