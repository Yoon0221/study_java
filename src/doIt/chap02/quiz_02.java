package doIt.chap02;

import java.util.Scanner;

public class quiz_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];

        int max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
            sum += grades[i];

            if (max < grades[i])
                max = grades[i];
        }
        sc.close();

        double new_avg = sum * 100;
        new_avg /= max * n;
        System.out.println(new_avg);
    }
}
