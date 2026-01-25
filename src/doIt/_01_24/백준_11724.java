package doIt._01_24;

import java.io.*;
import java.util.*;

public class 백준_11724 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    static void dfs(int node) {

        // 현재
        visited[node] = true;

        // 인접 재귀
        for (int next : graph[node]) {
            if (!visited[next]) dfs(next);
        }

    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            visited[i] = false;
        }

        // 가중치 없음
        graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 무방향
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        // dfs - 연결 요소 개수 세기
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i])
            {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}