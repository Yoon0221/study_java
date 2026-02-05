package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_15652 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int m;
    static StringBuilder sb = new StringBuilder();
    static List<Integer> path = new ArrayList<>();

    static void dfs(int start, int depth) {
        if (depth == m) {
            for(int i : path) sb.append(i + " ");
            sb.append("\n");
            return;
        }
        for (int i=start; i<n; i++) {
            path.add(i+1);
            dfs(i, depth+1);
            path.remove(path.size()-1);
        }
    }
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs(0,0);
        System.out.println(sb.toString());
    }
}