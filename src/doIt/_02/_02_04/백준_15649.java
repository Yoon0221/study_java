package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_15649 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static List<Integer> path = new ArrayList<>();
    static int n;
    static int m;
    static boolean[] visited;

    static void dfs(int depth) {
        if (depth == m) {
            for (int i : path) System.out.print(i + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i<n; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            path.add(i+1);
            dfs(depth+1);
            path.remove(path.size()-1);
            visited[i] = false;
        }
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];

        dfs(0);
    }

}