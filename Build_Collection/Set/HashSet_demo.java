package Build_Collection.Set;

/*
HashSet特点:
    底层数据结构是哈希表
    无序
    没有带索引方法
    元素唯一
 **    保证元素唯一,重写hashcode() & equals()
 */
import java.util.HashSet;

public class  HashSet_demo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("wink");
        hs.add("kin");
        hs.add("sweet");

        for (String s : hs)
        {
            System.out.println(s);
        }
    }
}
