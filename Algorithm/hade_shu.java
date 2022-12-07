package Algorithm;

import java.util.Scanner;

public class hade_shu {
    public static void main(String[] args) {
        double n;
        double temp = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for (int i = 2; i <= n; i++)
        {
            for (int j = 1; j <= i/2; j++)
            {
                if (i % j == 0)
                {
                    temp = temp+j;
                }
            }

            if (temp == i)
            {

                System.out.print(i+"  ");
                for (int t = 1; t <= i/2; t++)
                {

                    if (i % t == 0)
                    {
                        System.out.print(t+", ");
                    }
                }

                System.out.println();
            }
            temp = 0;//重置
        }
    }
}
