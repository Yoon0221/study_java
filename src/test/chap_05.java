package test;

import java.util.Scanner;

// n개의 정수를 입력받아 배열을 만들어라. 그리고 0개 이상의 연속된 수들을 더해서 최댓값을 구하여라.
public class chap_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int sum = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            // 갱신 or 누적합
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
