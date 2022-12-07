package Build_Collection.Set;
/*
获取哈希值
 */
public class HashCode_demo {
    public static void main(String[] args) {
        Stu s1 = new Stu("路明非",18);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("===");
        System.out.println("kin".hashCode());
        System.out.println("wink".hashCode());
        System.out.println("kin".hashCode());
        System.out.println("李嘉图".hashCode());
        System.out.println("路明非".hashCode());

    }
}
