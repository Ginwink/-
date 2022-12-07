package Build_Collection.Map;

import java.util.*;

/*
统计字符次数
 */
public class 统计_Al {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字母：");
        String line = sc.nextLine();

//        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
//      TreeMap集合自然排序
        TreeMap<Character,Integer> hm = new TreeMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++){
            //charAt(T);返回指定位置的字符
            char key = line.charAt(i);

            Integer value = hm.get(key);
            if (value == null){
                hm.put(key,1);

            }else {
                value++;
                hm.put(key,value);

            }

        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet){

            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");

        }
        String result = sb.toString();
        System.out.println(result);
    }
}
