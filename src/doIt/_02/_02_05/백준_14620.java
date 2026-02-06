package doIt._02._02_05;

import java.io.*;
import java.util.*;

public class 백준_14620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] graph;
    static boolean[][] visited;
    static int n;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static int place(int x, int y) {
        int cost = 0;
        cost += graph[x][y];
        visited[x][y] = true;

        for (int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            cost += graph[nx][ny];
            visited[nx][ny] = true;
        }
        return cost;
    }

    static void unplace(int x, int y) {
        visited[x][y] = false;

        for (int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            visited[nx][ny] = false;
        }
    }

    static boolean canPlace(int x, int y) {
        if (visited[x][y]) return false;

        for (int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 1 || ny < 1 || nx > n || ny > n) return false;
            if (visited[nx][ny]) return false;
        }
        return true;
    }

    static int min = Integer.MAX_VALUE;
    static void dfs(int depth, int cost) {
        // 현재
        if (depth == 3) {
            min = Math.min(min, cost);
            return;
        }
        // 인접
        for(int i =1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(!canPlace(i,j)) continue;

                int add = place(i,j);
                dfs(depth+1, cost+add);
                unplace(i,j);
            }
        }

    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        for(int i =1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(min);
    }
}