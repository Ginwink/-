package Build_fan_xing;

import com.sun.security.jgss.GSSUtil;

import java.util.List;

/*
可变参数
    List接口静态方法
    返回任意数量元素的不可变列表
 通过List.of方法:
    不能做添加、删除、修改操作
  */
public class List_demo {
    public static void main(String[] args) {
        List<String> list = List.of("wink","kin","sweet");
        System.out.println(list);
    }
}
