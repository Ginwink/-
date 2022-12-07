package Build_Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
HashMap嵌套ArrayList
 */
public class Al_Hashmap_ArrayL {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

        ArrayList<String> lh = new ArrayList<String>();

        lh.add("路明非");
        lh.add("绘梨衣");

        ArrayList<String> cx = new ArrayList<String>();

        cx.add("楚子航");
        cx.add("夏弥");

        Set<String> keySet = hashMap.keySet();
        for (String  key : keySet){
            ArrayList<String> value = hashMap.get(key);
            for (String s : value){
                System.out.println(s);
            }
        }
    }
}
