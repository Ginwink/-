package Build_jie_kou;
/*
* 抽象类在实现接口时
* 可以不重写接口的方法
* 继承抽象的子类还得重写接口的方法*/
public class Dog implements JumpText{

    @Override
    public void Jump() {
        System.out.println();
    }
}
