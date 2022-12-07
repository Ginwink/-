package Build_Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Al {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("路明非");
        list.add("楚子航");
        list.add("凯撒");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("============");
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("============");
        for(String s : list){
            System.out.println(s);
        }
    }
}
