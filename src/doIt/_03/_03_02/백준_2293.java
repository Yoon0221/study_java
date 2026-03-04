package doIt._03._03_02;

import java.io.*;
import java.util.*;

public class 백준_2293 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int j=0; j<n; j++) {
            for(int i = arr[j]; i <= k; i++) {
                dp[i] += dp[i-arr[j]];
            }
        }

        System.out.println(dp[k]);
    }
}