package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_9663 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int n;
    static int[][] graph;

    // depth 까지만 검사.
    static boolean canPlace(int depth, int y) {

        for(int i=0; i<depth; i++) {
            if(graph[i][y] == 1) return false;
            int d = depth - i;
            if(!(y+d < 0 || y+d > n-1)) if(graph[i][y+d] == 1) return false;
            if(!(y-d < 0 || y-d > n-1)) if(graph[i][y-d] == 1) return false;
        }

        return true;
    }

    static void place(int x, int y) {
        graph[x][y] = 1;
    }

    static void unplace(int x, int y) {
        graph[x][y] = 0;
    }

    // 퀸을 놓을 수 있는 dfs
    static int cnt;
    static void dfs(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }

        for(int i = 0; i<n; i++) {
            if(!canPlace(depth,i)) continue;

            place(depth,i);
            dfs(depth+1);
            unplace(depth,i);
        }
    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        cnt = 0;
        dfs(0);
        System.out.println(cnt);

    }
}