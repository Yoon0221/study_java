package doIt._02._02_22;

import java.io.*;
import java.util.*;

public class 백준_11726 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        long dp[] = new long[1001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=1000; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) %10007;
        }

        System.out.println(dp[n]);
    }
}