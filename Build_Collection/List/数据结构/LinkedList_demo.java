package Build_Collection.List.数据结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
常用方法
 */
public class LinkedList_demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
linkedList.add("hi~");
//        首添加
        linkedList.addFirst("like");
//        尾添加
        linkedList.addLast("wink");
//        返回头
        System.out.println(linkedList.getFirst());
//        返回尾
        System.out.println(linkedList.getLast());
//        删除返回头
        System.out.println(linkedList.removeFirst());
//        删除返回尾
        System.out.println(linkedList.removeLast());
    }
}
