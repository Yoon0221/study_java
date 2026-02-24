package doIt._02._02_23;

import java.io.*;
import java.util.*;

public class 백준_1463 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int INF = 1_000_000_000;

        int[] dp = new int[n+1];
        Arrays.fill(dp, INF);

        dp[0] = 0;
        for(int i = 1; i<= n; i++) {

            if (i % 3 == 0)
                if (i/3 >= 0)
                    dp[i] = Math.min(dp[i], dp[i/3] + 1);

            if (i % 2 == 0)
                if (i/2 >= 0)
                    dp[i] = Math.min(dp[i], dp[i/2] + 1);

            if (i-1 >= 0)
                dp[i] = Math.min(dp[i], dp[i-1] + 1);
        }

        System.out.println(dp[n]-1);
    }
}