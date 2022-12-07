package Build_IOliu.Build_xu_lie;

import java.io.Serializable;

/*学生类*/
public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
//    private int id;
    private transient int id; //被transient修饰的不参与序列化

    public Student() {
    }

    public Student(String name, int id) {

        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
