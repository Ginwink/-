package Algorithm;

public class demo{
    public static void main(String[] args) {
        double a = 100;
        double b = 2;
        double temp = 0;
        for (int i = 0 ; i <= 10 ; i++  ) {
            temp = a/b;
            a=temp;
            System.out.println(temp);
        }



    }
}