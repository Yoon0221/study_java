package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_15651 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static List<Integer> path;

    static void dfs(int depth) {

        if (depth == m) {
            for (int i : path) sb.append(i + " ");
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            path.add(i+1);
            dfs(depth+1);
            path.remove(path.size()-1);
        }
    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        path = new ArrayList<>();
        dfs(0);
        System.out.println(sb.toString());
    }
}