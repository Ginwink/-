package Build_ji_he;

//包装类

public class Student {
    private String name;
    private int age;

    public Student(){}
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
