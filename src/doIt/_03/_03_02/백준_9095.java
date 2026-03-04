package doIt._03._03_02;

import java.io.*;
import java.util.*;

public class 백준_9095 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[12];
        dp[0] = 1;
        for(int i =1; i<12; i++) {
            for(int k = 1; k<=3; k++) {
                if(i-k >=0) dp[i] += dp[i-k];
            }
        }

        for(int i =0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            System.out.println(dp[now]);
        }
    }
}