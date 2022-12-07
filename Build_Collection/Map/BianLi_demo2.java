package Build_Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BianLi_demo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("路明非","绘梨衣");
        map.put("楚子航","夏弥");
        map.put("凯撒","陈墨瞳");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        for (Map.Entry<String,String> me : entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
