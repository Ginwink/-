package Build_Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Interface Map<K , V> K:键的类型 V:值的类型
    键映射到值的对象,键唯一,每个键映射一个值

 */
public class Map_demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("on.1","wink");
        map.put("on.2","kin");
        map.put("on.3","sweet");
//        键一样时,put代表修改
        System.out.println(map);
        System.out.println("============");

//        删除
        System.out.println(map.remove("on.1"));
        System.out.println(map.remove("on.1","wink"));
        System.out.println(map.remove("on3"));
        System.out.println(map);
        System.out.println("===================");

//        清空
//        map.clear();

//        判断是否包含指定键
        System.out.println(map.containsKey("on.2"));
        System.out.println(map.containsKey("on2"));
        System.out.println("=================");
//        判断是否包含指定值
        System.out.println(map.containsValue("kin"));
        System.out.println(map.containsValue("kind"));

//        判断集合是否为空
        System.out.println(map.isEmpty());
        System.out.println("==============");

//        集合长度
        System.out.println(map.size());
        System.out.println("===================");

//     根据键获取值的集合
        System.out.println(map.get("on.3"));
        System.out.println("===");

//        获取所有键的集合
        Set<String> KeySet = map.keySet();
        for (String s : KeySet ){
            System.out.println(s);
        }
        System.out.println("===");

//        获取所有值的集合
        Collection<String> values = map.values();

        for (String s : values){
            System.out.println(s);
        }
    }
}
