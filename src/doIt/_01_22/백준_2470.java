package doIt._01_22;

import java.io.*;
import java.util.*;

public class 백준_2470 {

    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] N = new int [n];
        for (int i = 0; i<n; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(N);

        int left = 0;
        int right = n-1;
        int now_min = Integer.MAX_VALUE;
        int[] ans = new int[2];
        int sum = 0;

        while (left < right) {

            sum = N[left] + N[right];

            if (Math.abs(sum) < now_min) // 새로운 갱신
            {
                now_min = Math.abs(sum);
                ans[0] = N[left];
                ans[1] = N[right];
            }

            if (sum > 0) {
                right--;
            } else {
                left++;
            }

        }

        System.out.println(ans[0] + " " + ans[1]);
    }
}