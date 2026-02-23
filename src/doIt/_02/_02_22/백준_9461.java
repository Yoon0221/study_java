package doIt._02._02_22;

import java.io.*;
import java.util.*;

public class 백준_9461 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());

        long[] dp = new long[101];

        // dp 수열 만들기
        // 1차원 & 경우의 수 문제
        // dp[i] = dp[n-1] + d[[n-2] + .... // 선택의 갯수만큼
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        // 여기부터는 2개의 조합으로;
        // dp[6] = dp[1] + dp[5] = 3;
        // dp[7] = dp[2] + dp[6] = 4;
        // dp[8] = dp[3] + ;dp[7] = 5;
        // dp[9] = dp[4] + 5 = 7;
        // dp[10] = dp[5] + 7 = 9;
        // dp[11] = dp[6] + 9 = 12;
        // dp[12] = dp[7] + 12 = 16;
        // dp[13] = dp[8] + 16 = 21;

        for(int i = 6; i<= 100; i++) {
            dp[i] = dp[i-5] + dp[i-1];
        }

        for(int i =0; i<t; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append(dp[now] + "\n");
        }

        System.out.println(sb.toString());
    }
}