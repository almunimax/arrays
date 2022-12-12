import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Задание 1
        System.out.println("Задание 1");

        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.print(weight[i] + " ");
        }
        System.out.println();

        double[] number = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 12; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        int[] run = new int[31];
        run[0] = 5;
        run[1] = 7;
        run[2] = 10;
        run[3] = 11;
        run[4] = 11;
        for (int i = 0; i < 31; i++) {
            System.out.print(run[i] + " ");

        }

        // Задание 2
        System.out.println("Задание 2");

        int [] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.print(Arrays.toString(weight));

        System.out.println();

        double [] number = {1.57, 7.654, 9.986,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 12; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        int [] run = new int [31];
        run [0] = 5;
        run [1] = 7;
        run [2] = 10;
        run [3] = 11;
        run [4] = 11;
        for (int i = 0; i < 31; i++) {
            System.out.print(run[i] + " ");

        }
}