package doIt._02._02_06;

import java.io.*;
import java.util.*;

public class 백준_14620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] graph;
    static boolean[][] visited;
    static int n;

    static int[] dx = {0,0,0,1,-1};
    static int[] dy = {0,1,-1,0,0};
    static boolean canPlace(int x, int y) {
        for(int i =0; i <5; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > n-1 || ny > n-1) return false;

            if (visited[nx][ny]) return false;
        }
        return true;
    }

    static int place(int x, int y) {
        int cost = 0;
        for(int i =0; i <5; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            cost += graph[nx][ny];
            visited[nx][ny] = true;
        }
        return cost;
    }

    static void unplace(int x, int y) {
        for(int i =0; i <5; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            visited[nx][ny] = false;
        }
    }

    static int answer = Integer.MAX_VALUE;
    static void dfs(int depth, int cost) {
        if (depth == 3) {
            answer = Math.min(answer, cost);
            return;
        }

        for(int i =0; i<n; i++) {
            for(int j=0; j<n;j++) {
                if(!canPlace(i,j)) continue;
                int value = place(i,j);
                dfs(depth+1, cost+value);
                unplace(i,j);
            }
        }

    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];
        for(int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n;j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(answer);
    }
}