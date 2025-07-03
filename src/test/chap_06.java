package test;

import java.util.Scanner;

// n 개의 한 자리 수 자연수를 입력받아 배열을 만들어라. 그리고 연속된 숫자의 조립중 소수이면서 최댓값을 구하여라.
public class chap_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        long max = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum *= 10;
                sum += arr[j];

                if (sum > max) {
                    if (isPrime(sum))
                        max = sum;
                }

            }
        }

        System.out.println(max);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if((int)n%i == 0)
                return false;
        }
        return true;
    }
}
