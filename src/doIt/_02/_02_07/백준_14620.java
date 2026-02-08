package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_14620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;

    static boolean[][] visited;
    static int[][] graph;

    static int[] dx = {0,0,0,1,-1};
    static int[] dy = {0,1,-1,0,0};

    static boolean canPlace(int x, int y) {
        // 본인 & 상하좌우 돌면서 visited 체크 여부 확인
        for(int i =0; i<5; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0|| nx > n-1 || ny > n-1) return false;

            if (visited[nx][ny]) return false;
        }
        return true;
    }

    static int place(int x, int y) {
        // 본인 & 상하좌우 돌면서 cost 누적, visited 체크
        int cost = 0;
        for(int i =0; i<5; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            visited[nx][ny] = true;
            cost += graph[nx][ny];
        }
        return cost;
    }

    static void unplace(int x, int y) {
        // 본인 & 상하좌우 돌면서 visited 체크 해제
        for(int i =0; i<5; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            visited[nx][ny] = false;
        }
    }

    static int ans = Integer.MAX_VALUE;
    static void dfs(int depth, int cost) {
        if (depth == 3) {
            ans = Math.min(ans,cost);
            return;
        }

        for(int i =0; i<n; i++) {
            for(int j =0; j<n; j++) {
                if(!canPlace(i,j)) continue;

                int value = place(i,j);
                dfs(depth+1, cost + value);
                unplace(i,j);
            }
        }
    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        visited = new boolean[n][n];
        graph = new int[n][n];

        for(int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(ans);
    }
}