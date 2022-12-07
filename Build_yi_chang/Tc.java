package Build_yi_chang;
/*
抛出异常
 */
public class Tc {
    public void checkScore(int score) throws ScoreException{
        if (score < 0 || score > 100){
            throw new ScoreException("分数有误");//给出注释信息
        }else {
            System.out.println("分数正常");
        }


    }
}
