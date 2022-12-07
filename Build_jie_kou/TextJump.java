package Build_jie_kou;
/*
JAVA的静态代理和动态代理来，类比Spring AOP面向切面编程：增强消息，也是代理模式。

而我们的静态代理和动态代理，与（service）接口和（serviceImpl）
可以说静态代理是实现类的增强消息。而且，静态代理针对的是所以实现接口
的实现类（通过向上转型实现）。
 */
public class TextJump {
    public static void main(String[] args) {
        JumpText Jt = new Cat();
        Jt.Jump();
    }
}
