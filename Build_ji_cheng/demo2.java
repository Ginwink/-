package Build_ji_cheng;
//子类

public class demo2 extends Dog
{
    public demo2()
    { }
    public demo2(String name, String age)
    {
        super(name,age);
    }

    public void cat()
    { }

    public void cat( String age)
    {
        System.out.println("zi我是" + age + "的y");
    }

}
