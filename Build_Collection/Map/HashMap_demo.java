package Build_Collection.Map;

import com.sun.source.doctree.SerialTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_demo {
    public static void main(String[] args) {
        HashMap<String, Student_demo> hashMap = new HashMap<>();

        Student_demo Stu1 = new Student_demo("路明非", "绘梨衣");
        Student_demo Stu2 = new Student_demo("楚子航", "夏弥");
        Student_demo Stu3 = new Student_demo("凯撒", "陈墨瞳");

        hashMap.put("onw", Stu1);
        hashMap.put("tow", Stu2);
        hashMap.put("there", Stu3);

        //键找值
        Set<String> keySet = hashMap.keySet();

        for (String key : keySet) {
            Student_demo value = hashMap.get(key);
            System.out.println(key + "," + value.getName() + "&" + value.getWife());
        }
        System.out.println("===");

        Set<Map.Entry<String, Student_demo>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Student_demo> me : entrySet){
            String key = me.getKey();
            Student_demo value = me.getValue();
            System.out.println(key+","+value.getName()+"&"+value.getWife());
        }
    }
}
