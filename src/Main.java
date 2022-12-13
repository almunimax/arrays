import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Задание 1
        System.out.println("Задание 1");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(weight[i] + " ");
        }
        System.out.println();

        double[] number = {1.57, 7.654, 9.986};
        for (int z = 0; z < 3; z++) {
            System.out.print(number[z] + " ");
        }
        System.out.println();

        int[] run = new int[7];
        run[0] = 5;
        run[1] = 7;
        run[2] = 10;
        run[3] = 11;
        run[4] = 11;
        for (int x = 0; x < 7; x++) {
            System.out.print(run[x] + " ");

        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");

        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ",");
        }


        for (int z = 0; z < number.length; z++) {
            if (z == number.length - 1) {
                System.out.println(number[z]);
                break;
            }
            System.out.print(number[z] + ",");
        }

        for (int x = 0; x < run.length; x++) {
            if (x == run.length - 1) {
                System.out.println(run[x]);
                break;
            }
            System.out.print(run[x] + ",");
        }

        // Задание 3
        System.out.println("Задание 3");

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ",");
        }

        for (int z = number.length - 1; z >= 0; z--) {
            if (z == 0) {
                System.out.println(number[z]);
                break;
            }
            System.out.print(number[z] + ",");
        }

        for (int x = run.length - 1; x >= 0; x--) {
            if (x == 0) {
                System.out.println(run[x]);
                break;
            }
            System.out.print(run[x] + ",");
        }


        // Задание 4
        System.out.println("Задание 4");

        for (int i = 0; i < weight.length; i++)
            if (weight[i] % 2 != 0) {
                weight[i] += 1;}
                System.out.print(Arrays.toString(weight));

            }
        }








