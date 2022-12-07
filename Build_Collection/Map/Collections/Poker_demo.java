package Build_Collection.Map.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker_demo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        String[] colors = {"♡", "♤", "♧", "♢"};

        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }

        array.add("大王");
        array.add("小王");

        Collections.shuffle(array);

        ArrayList<String> one = new ArrayList<String>();
        ArrayList<String> two = new ArrayList<String>();
        ArrayList<String> there = new ArrayList<String>();

        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            if (i >= array.size() - 3){
                dipai.add(poker);
            }else if (i % 3 == 0) {
                one.add(poker);
            } else if (i % 3 == 1) {
                two.add(poker);
            } else if (i % 3 == 2) {
                there.add(poker);
            }
        }

        System.out.println(one);
        System.out.println(two);
        System.out.println(there);
        System.out.println(dipai);
        System.out.println("===");

        lookpoker("玩家1",one);
        lookpoker("玩家2",two);
        lookpoker("玩家3",there);
        lookpoker("底牌",dipai);
    }

    public static void lookpoker(String name,ArrayList<String> array) {
        System.out.print(name+"的手牌：");

         for (String poker : array) {
            System.out.print(poker + " ");
        }

        System.out.println();
    }
}

