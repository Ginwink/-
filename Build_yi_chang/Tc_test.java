package Build_yi_chang;

import java.util.Scanner;

/*
测试类
 */
public class Tc_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = scanner.nextInt();

        Tc tc = new Tc();
        try {
            tc.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
