package doIt._01_23;

import java.io.*;
import java.util.*;

public class 백준_1806 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int now = 0;
        int ans = Integer.MAX_VALUE;
        while(true) {
            if (now >= m) {
                ans = Math.min(ans, right-left+1);
                now -= arr[left];
                left++;
            }
            else {
                right++;
                if(right >= n) break;
                now += arr[right];
            }
        }

        System.out.println(ans);

    }
}