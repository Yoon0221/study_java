package doIt._03._03_02;

import java.io.*;
import java.util.*;

public class 백준_9084 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for(int test = 0; test < t; test++) {
            int n = Integer.parseInt(br.readLine());

            int arr[] = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

            int m = Integer.parseInt(br.readLine());

            int[] dp = new int[m+1];
            dp[0] = 1;
            for(int j = 0; j <n; j++) {
                for(int i = arr[j]; i <=m; i++) {
                    dp[i] += dp[i-arr[j]];
                }
            }

            sb.append(dp[m] + "\n");
        }

        System.out.println(sb.toString());

    }
}