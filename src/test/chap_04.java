package test;

import java.util.Scanner;

// n개의 정수를 입력받아 배열을 만들어라. 그리고 중복된 정수쌍을 출력하라.
public class chap_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int[] temp = new int[n];
        int count_temp = 0;
        for(int i = 0; i < n; i++) {

            boolean isHave = false;
            for (int j = 0; j < n; j++) {
                if(arr[i] == temp[j]) {
                    isHave = true;
                    break;
                }
            }
            if(!isHave){
                temp[count_temp] = arr[i];
                count_temp++;
            }
        }

        int[] index = new int[count_temp];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count_temp; j++) {
                if (arr[i] == temp[j]) {
                    index[j] += 1;
                }
            }
        }

        for (int i = 0; i < count_temp; i++) {
            if (index[i] > 1) {
                for (int j = 0; j <count_temp*( count_temp-1)/2 ; j++) {
                    System.out.println("(" + temp[i] + "," + temp[i] + ")");
                }
            }
        }

    }
}
