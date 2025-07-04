package doIt.chap02;

import java.io.*;
import java.util.*;

public class quiz_03 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] sum = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (i==0) {
                sum[i] = Integer.parseInt(st.nextToken());
                continue;
            }
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            if (a == 0)
                answer[i] = sum[b];
            else
                answer[i] = sum[b] - sum[a-1];

        }

        br.close();

        for (int i = 0; i < m; i++) {
            System.out.println(answer[i]);
        }

    }
}
