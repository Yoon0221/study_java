package doIt._02._02_23;

import java.io.*;
import java.util.*;

public class 백준_9095 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[12];
        dp[0] = 1;

        for(int i =1; i<= 11; i++) {
            for(int j = 1; j <= 3; j++) {

                if(i-j >= 0) dp[i] += dp[i-j];
            }
        }

        for(int i = 0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            sb.append(dp[now] + "\n");
        }

        System.out.println(sb.toString());
    }
}