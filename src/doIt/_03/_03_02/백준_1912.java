package doIt._03._03_02;

import java.io.*;
import java.util.*;

public class 백준_1912 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int cur = arr[0];
        int ans = cur;

        for(int i =1; i<n; i++) {
            // 연속 vs 새로 시작
            cur = Math.max(arr[i], arr[i] + cur);

            // 갱신
            ans = Math.max(ans, cur);
        }

        System.out.println(ans);
    }
}