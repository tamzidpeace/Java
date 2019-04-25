package com.example.lib;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {
        int num_of_boy, num_of_girl, skill_diff, max_possible_pairs = 0;

        Scanner scanner = new Scanner(System.in);

        num_of_boy = scanner.nextInt();
        int[] boy = new int[num_of_boy];

        for (int i = 0; i < num_of_boy; i++) {
            boy[i] = scanner.nextInt();
        }
        Arrays.sort(boy);

        num_of_girl = scanner.nextInt();
        int[] girl = new int[num_of_girl];

        for (int i = 0; i < num_of_girl; i++) {
            girl[i] = scanner.nextInt();
        }
        Arrays.sort(girl);

        for (int i = 0; i < boy.length; i++) {
            for (int j = 0; j < girl.length; j++) {
                if (boy[i] > 0 && girl[j] > 0) {
                    skill_diff = boy[i] - girl[j];
                    if (Math.abs(skill_diff) == 0 || Math.abs(skill_diff) == 1) {
                        boy[i] = -1;
                        girl[j] = -1;
                        max_possible_pairs++;
                    }
                }
            }
        }

        System.out.println(max_possible_pairs);
    }

}
