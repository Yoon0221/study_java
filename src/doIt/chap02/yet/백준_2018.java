package doIt.chap02.yet;

import java.util.Scanner;

public class 백준_2018 {

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