package doIt._01_22;

import java.io.*;
import java.util.*;

public class 백준_11659 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] S = new int[n+1];
        S[0] = 0;
        for (int i=1; i<=n; i++) {
            int now = Integer.parseInt(st.nextToken());
            S[i] = S[i-1] + now;
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken())-1;
            int l = Integer.parseInt(st.nextToken());
            int ans = S[l] - S[f];
            sb.append(ans+"\n");
        }

        System.out.println(sb.toString());
    }
}