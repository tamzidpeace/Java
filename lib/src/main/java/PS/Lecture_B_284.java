package PS;

import java.util.Scanner;

public class Lecture_B_284 {

    public static void main(String[] args) {

        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        String[] sortF = new String[m];
        String[] sortS = new String[m];
        String[] mFinal = new String[m];
        String[] lecture = new String[n];

        for (int i = 0; i < m; i++) {
            sortF[i] = scanner.next();
            sortS[i] = scanner.next();
            if (sortS[i].length() < sortF[i].length())
                mFinal[i] = sortS[i];
            else
                mFinal[i] = sortF[i];
        }

       for (int i = 0; i < n; i++) {
            lecture[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(lecture[i].equals(sortS[j]) || lecture[i].equals(sortF[j])) {
                    lecture[i] = mFinal[j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(lecture[i] + " ");
        }

    }
}
