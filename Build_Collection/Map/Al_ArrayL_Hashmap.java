package Build_Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/*
ArrayList嵌套HashMap
 */
public class Al_ArrayL_Hashmap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String, String>>();

        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("路明非","绘梨衣");
        hashMap.put("楚子航","夏弥");

        arrayList.add(hashMap);

        for (HashMap<String,String>  array: arrayList){
            Set<String> keySet = array.keySet();
            for (String key : keySet){
                String value = array.get(key);
                System.out.println(key+","+value);
            }
        }
    }
}
