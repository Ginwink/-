package Build_Collection.Map.Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PoKermax_demo {
    public static void main(String[] args) {
//        键：编号 值：牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//          编号
        ArrayList<Integer> array = new ArrayList<Integer>();

//
        String[] colors = {"♡", "♤", "♧", "♢"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }

        hm.put(index, "小王");
        array.add(index);
        index++;

        hm.put(index, "大王");
        array.add(index);
        TreeSet<Integer> ts = new TreeSet<Integer>();

        Collections.shuffle(array);

        TreeSet<Integer> one = new TreeSet<Integer>();
        TreeSet<Integer> two = new TreeSet<Integer>();
        TreeSet<Integer> there = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();
//
        for (int i = 0; i < array.size(); i++) {
            Integer poker = array.get(i);

            if (i >= array.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                one.add(poker);
            } else if (i % 3 == 1) {
                two.add(poker);
            } else if (i % 3 == 2) {
                there.add(poker);
            }
        }
//        for (int i = 0; i < array.size(); i++) {
//            Integer poker = array.get(i);
//
//            if (i >= array.size() - 3){
//                dp.add(poker);
//            }else if (i % 3 == 0) {
//                one.add(poker);
//            } else if (i % 3 == 1) {
//                two.add(poker);
//            } else if (i % 3 == 2) {
//                there.add(poker);
//            }
//        }

        for (Integer i : ts) {
            String s = hm.get(i);
            System.out.println(s);
        }
        look("玩家1", one, hm);
        look("玩家2", two, hm);
        look("玩家3", there, hm);
    }

    public static void look(String name, TreeSet<Integer> treeSet, HashMap<Integer, String> hashMap) {
        System.out.print(name + "的牌:");
        for (Integer key : treeSet) {
            String poker = hashMap.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
