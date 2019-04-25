package PS;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers_552_A {

    public static void main(String[] args) {
        int[] number = new int[4];
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            number[i] = scanner.nextInt();
        }

        Arrays.sort(number);
        a = number[3] - number[0];
        b = number[3] - number[1];
        c = number[3] - number[2];

        System.out.println(a + " " + b + " " + c);

    }
}
