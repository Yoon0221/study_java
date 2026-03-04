package doIt._03._03_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_2559 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int cur = 0;
        for(int i =0; i<k; i++) cur+=arr[i];
        int ans = cur;

        for(int i =k; i<n; i++) {

            // 연속 vs 새로 시작
            cur = Math.max(arr[i] + cur, arr[i]+cur-arr[i-k]);
            // 갱신
            ans = Math.max(ans, cur);

        }

        System.out.println(ans);
    }
}