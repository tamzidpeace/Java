package PS;

import java.util.Scanner;

public class Neki_Finds_Graps_554_A {

    public static void main(String[] args) {
        int n, m, result = 0, evenKey = 0, oddKey = 0, evenChest = 0, oddChest = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] chest = new int[n];
        int[] key = new int[m];
        for (int i = 0; i < n; i++) {
            chest[i] = scanner.nextInt();
            if (chest[i] % 2 == 0)
                evenChest++;
            else
                oddChest++;
        }

        for (int i = 0; i < m; i++) {
            key[i] = scanner.nextInt();
            if (key[i] % 2 == 0)
                evenKey++;
            else
                oddKey++;
        }

        if (evenChest >= oddKey)
            result += oddKey;
        else
            result += evenChest;

        if (oddChest >= evenKey)
            result += evenKey;
        else
            result += oddChest;

        System.out.println(result);
    }
}
