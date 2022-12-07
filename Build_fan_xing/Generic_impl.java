package Build_fan_xing;

public class Generic_impl<T> implements Generic_face<T> {
    @Override
    public  void show(T t) {
        System.out.println(t);
    }
}
