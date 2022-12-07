package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubbling {
    public static void main(String[] args) {
        int [] a ={78,95,32,45,32,3,48,21};
        //System.out.println(show(a));
        //========================================
//
        int sum = 1;
        for (int j = 0; j < a.length-1; j++)
        {

            for (int i = 0; i < a.length - 1 - j; i++)
            {
                if (a[i] > a[i + 1])
                {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sum ++;
                }
            }

        }
        System.out.println(show(a)+"=="+sum);
    }
        //=========================================
    public static String show(int[]a)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i ++)
        {
            if(i == (a.length-1))
            {
                sb.append(a[i]);
            }
            else
            {
                sb.append(a[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();

        return s;
    }
}



