package doIt._01._01_23;

import java.io.*;
import java.util.*;

public class 백준_1929 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 체 거르기
        boolean[] isPrime = new boolean[n+1];
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = m; i < n; i++) {
            if(isPrime[i]) System.out.println(i);
        }

    }
}