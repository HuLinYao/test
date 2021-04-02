package liaoxuefeng_train;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] scores = new int[] { 88, 77, 51, 66 };

        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();

    }

}

class Score {

    private String scores; //将Score中的scores字段改为String类，避免被修改

    public Score(int[] scores) {

        this.scores = Arrays.toString(scores);

    }

    public void printScores() {

        System.out.println(scores); //直接输出字符串scores

    }

}
