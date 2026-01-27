package doIt._01_26;

import java.io.*;
import java.util.*;

public class 백준_2667 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static boolean[][] visited;
    static int n;

    // 0-base
    static int dfs(int x, int y) {
        int cnt = 1;
        // 현재
        visited[x][y] = false;

        // 인접 재귀
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for (int i = 0; i < 4 ; i ++) {

            int nx = x + dx[i];
            int ny = y+dy[i];
            if (nx <0 || ny<0 || nx>n-1||ny>n-1) continue;

            if (visited[nx][ny]) cnt += dfs(nx,ny);
        }

        return cnt;
    }

    static public void main(String args[]) throws IOException {

        n = Integer.parseInt(br.readLine());

        visited = new boolean[n][n];
        for (int i = 0; i <n; i++) {
            String now = br.readLine();
            for (int j = 0; j < n; j++) {
                if ((now.charAt(j) - '0') == 0) visited[i][j] = false;
                else visited[i][j] = true;
            }
        }

        int ans = 0;
        for (int i = 0 ; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) {
                    sb.append(dfs(i,j) + "\n");
                    ans++;
                }
            }
        }

        System.out.println(ans);
        System.out.println(sb.toString());
    }
}