package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_15650 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int m;
    static List<Integer> path;

    static void dfs(int start, int depth) {

        if (depth == m) {
            for (int i : path) System.out.print(i + " ");
            System.out.println();
            return;
        }

        for (int i = start; i<n; i++) {
            path.add(i+1);
            dfs(i+1, depth+1);
            path.remove(path.size()-1);
        }
    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        path = new ArrayList<>();
        dfs(0,0);
    }
}