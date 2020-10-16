package org.example;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App
{
    static int MAX = 10000;
    static int boarder = (int) (MAX * 0.3);

    public static void main( String[] args )
    {
        task1();
    }

    public static void task1() {
        Random random = new Random();
        int sum = 0;
        int count = 0;
        int[] array = new int[MAX];
        for (int y = 0; y < 10000000; y++) {


            for (int i = 0;  i < boarder; i++) {
                array[i] = layer(random);
            }
            for (int i = boarder; i < MAX; i++) {
                array[i] = truths(random);
            }

            int countOfAnswers = 0;
            for (int i = 0; i < 100; i++) {
                countOfAnswers += array[random.nextInt(MAX)];
            }
            if (countOfAnswers<26) {
                sum++;
            }
            count++;
    //            System.out.println(countOfAnswers);
        }
        System.out.println("----------------------");
        System.out.println((double) sum/count+"\t"+count);

    }

    public static int layer(Random random) {
        return random.nextInt(MAX) < (int) (MAX * 0.6) ? 0 : 1;
    }

    public static int truths(Random random) {
        return random.nextInt(MAX) < (int) (MAX * 0.8) ? 0 : 1;
    }
}
