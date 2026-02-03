package doIt._01._01_22;

import java.io.*;
import java.util.*;

public class 백준_1940 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] N = new int[n];
        for (int i = 0; i <n; i++) N[i] = Integer.parseInt(st.nextToken());

        // sort
        Arrays.sort(N);

        int left = 0;
        int right = n-1;
        int cnt = 0;

        while (left < right) {
            int sum = N[left] + N[right];
            if (sum == m) {
                cnt++;
                // 가운데로 모이기
                left++;
                right--;
            } else if (sum > m) { // 작아져야 함
                right--;
            } else { // 커져야 함
                left++;
            }
        }

        System.out.println(cnt);
    }
}