package Build_Collection.Set;

import java.util.LinkedList;

public class LinkedHasSet_demo {
    public static void main(String[] args) {
        LinkedList<String> lks = new LinkedList<String>();

        lks.add("wink");
        lks.add("kin");
        lks.add("sweet");

        for (String s : lks){
            System.out.println(s);
        }
    }
}
