package Build_Collection.Set;

public class Comparable_Stu implements Comparable<Comparable_Stu> {
    private String name;
    private int age;
    public Comparable_Stu(){}

    public Comparable_Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
        /*
        升序this放前面,降序this放后面
         */
//        升
//        int num = this.age - s.age;
//        return num;

//        降
//        int number = s.age - this.age;
//        int num = number == 0 ? this.name.compareTo(传入参数.name) : number;


    @Override
    public int compareTo(Comparable_Stu o) {
        int num = this.age - o.age;
        int number = num == 0? this.name.compareTo(o.name) : num;
        return number;
    }
}
