package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_1182 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] arr;
    static int n;
    static int s;
    static List<Integer> path = new ArrayList<>();

    static int ans = 0;

    static void dfs(int idx) {
        if (idx == n) {
            int now = 0;
            for(int i : path) {
                now += i;
            }
            if(now == s && path.size() > 0) {
                ans++;
            }
            return;
        }

        // 선택
        path.add(arr[idx]);
        dfs(idx+1);
        path.remove(path.size()-1);

        // 비선택
        dfs(idx+1);
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        dfs(0);
        System.out.println(ans);
    }

}