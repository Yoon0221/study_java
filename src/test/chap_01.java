package test;

import java.util.Scanner;

// n개의 정수를 입력받아서 합과 최댓값 출력
public class chap_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 3;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            sum += input;

            if (i == 0) // 음수 방지
                max = input;
            if (input > max)
                max = input;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);

        sc.close();
    }
}
