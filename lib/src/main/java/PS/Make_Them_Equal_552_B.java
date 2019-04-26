package PS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Make_Them_Equal_552_B {

    public static void main(String[] args) {

        HashSet<String> uniqueNumber = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int totalNumber = scanner.nextInt();
        for (int i = 0; i < totalNumber; i++) {
            uniqueNumber.add(String.valueOf(scanner.nextInt()));
        }

        if (uniqueNumber.size() > 3)
            System.out.println(-1);
        else {
            int[] numbers = new int[uniqueNumber.size()];
            int j = 0;
            for (String i : uniqueNumber) {
                numbers[j++] = Integer.valueOf(i);
            }
            Arrays.sort(numbers);
            if (numbers.length == 1)
                System.out.println(0);
            else if (numbers.length == 2) {
                if ((numbers[1] - numbers[0]) % 2 == 0)
                    System.out.println((numbers[1] - numbers[0]) / 2);
                else
                    System.out.println(numbers[1] - numbers[0]);
            } else {
                if (numbers[2] - numbers[1] == numbers[1] - numbers[0])
                    System.out.println(numbers[2] - numbers[1]);
                else
                    System.out.println(-1);
            }
        }
    }
}
