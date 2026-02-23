package doIt._02._02_22;

import java.io.*;
import java.util.*;

public class 백준_11727 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int dp[] = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;
        for(int i = 4; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-2]) % 10007;
        }

        System.out.println(dp[n]);

    }
}