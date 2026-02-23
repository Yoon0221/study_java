package doIt._02._02_22;

import java.io.*;
import java.util.*;

public class 백준_9095 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[12];

        // dp 배열 만들기
        dp[1] = 1; // 1
        dp[2] = 2; // 1 1, 2
        dp[3] = 4; // 1 1 1, 1 2, 2 1, 3

        for(int i = 4; i <= 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i = 0; i< t; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append(dp[now] + "\n");
        }

        System.out.println(sb.toString());
    }
}