package doIt._01._01_28;

import java.io.*;
import java.util.*;

public class 백준_15649 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;
    static boolean[] visited;
    static int[] selected;

    static void dfs(int depth) {

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                selected[depth] = i+1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) visited[i] = false;

        dfs(0);

        System.out.println(sb.toString());
    }
}