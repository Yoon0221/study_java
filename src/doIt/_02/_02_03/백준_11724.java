package doIt._02._02_03;

import java.io.*;
import java.util.*;

public class 백준_11724 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int now) {
        // 현재 노드 방문
        visited[now] = true;

        // 인접 노드 재귀
        for (int n : graph[now]) {
            if (!visited[n]) dfs(n);
        }
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n+1];
        for (int i = 1; i<=n; i++) graph[i] = new ArrayList<>();

        visited = new boolean[n+1];
        for (int i = 1; i<=n; i++) visited[i] = false;

        for (int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        int ans = 0;
        for (int i = 1; i<=n; i++) {
            if (!visited[i]) {
                dfs(i);
                ans++;
            }
        }

        System.out.println(ans);

    }

}