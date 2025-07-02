package test;

import java.util.Scanner;

// n개의 정수를 입력받아 배열로 저장한다. 그리고, 해당 배열을 1칸씩 오른쪽으로 shift 한다.
public class chap_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }

        int last = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = last;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
