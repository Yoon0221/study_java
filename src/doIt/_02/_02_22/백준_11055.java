package doIt._02._02_22;

import java.io.*;
import java.util.*;

public class 백준_11055 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i =1; i<=n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n+1];
        dp[1] = 0;
        for(int i = 2; i <= n; i++) {
            dp[i] = arr[i];
            if(arr[i-1] < arr[i])
                dp[i] = Math.max( dp[i], dp[i] + arr[i] );
        }

        System.out.println(dp[n]);
    }
}