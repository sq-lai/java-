package com.laisiqi.test;

import java.util.Scanner;

public class Test5 {
    /*
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

     */
    public static void main(String[] args) {

        int[] scores = getScore();
        for (int i = 0; i < scores.length; i++) {

            System.out.println(scores[i]);

        }

        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);
        int avg = (sum - max - min) / (scores.length - 2);

        System.out.println("选手最后的得分为" + avg);
    }

    public static int[] getScore() {
        System.out.println("请输入6位评委的打分");
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        for (int i = 0; i < 6; i++) {
            int score = sc.nextInt();
            scores[i] = score;

        }

        return scores;

    }

    public static int getMax(int[] scores) {

        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] > max) {

                max = scores[i];

            }
        }

        return max;
    }

    public static int getMin(int[] scores) {

        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] < min) {

                min = scores[i];


            }


        }

        return min;

    }

    public static int getSum(int[] scores) {

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];



        }

        return sum;

    }



}
