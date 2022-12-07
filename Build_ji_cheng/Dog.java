package Build_ji_cheng;

//父类

public class Dog extends demo{
    public Dog()
    { }
    public Dog(String name, String age)
    {
        super(name, age);
    }

    public void look()
    {
        System.out.println("狗看门");
    }
}
