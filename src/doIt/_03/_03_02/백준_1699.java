package doIt._03._03_02;

import java.io.*;
import java.util.*;

public class 백준_1699 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int INF = 10000000;

        int[] dp = new int[n+1];
        Arrays.fill(dp, INF);

        dp[1] = 0;
        for(int i =1; i <=n; i++) {

            for(int j = 1; j*j <= n; j++) {
                if(j*j == n) dp[i] = Math.min(dp[i], dp[j] + 1);
            }

        }
    }
}