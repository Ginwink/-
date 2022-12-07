package Build_Collection.Map;

import Build_fan_xing.KeBianCan_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BianLi_demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("路明非","绘梨衣");
        map.put("楚子航","夏弥");
        map.put("凯撒","陈墨瞳");

        Set<String> keySet = map.keySet();

        for (String key : keySet){
            String values = map.get(key);
            System.out.println(key+"," + values);
        }
    }
}
