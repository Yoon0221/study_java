package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_15663 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[] arr;
    static int n;
    static int m;

    static List<Integer> path = new ArrayList<>();
    static boolean[] visited;

    static void dfs(int depth) {

        if (depth == m) {
            for(int i : path) sb.append(i + " ");
            sb.append("\n");
            return;
        }

        int now = 0;
        for(int i =0; i<n; i++) {
            if (visited[i]) continue;
            if (now == arr[i]) continue;
            else now = arr[i];

            visited[i] = true;
            path.add(arr[i]);
            dfs(depth+1);
            path.remove(path.size()-1);
            visited[i] = false;
        }
    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb.toString());

    }
}