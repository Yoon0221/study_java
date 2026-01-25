package doIt._01_24;

import java.io.*;
import java.util.*;

public class 백준_2667 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[][] visited;
    static StringBuilder sb = new StringBuilder();

    static int dfs(int x, int y) {

        int cnt = 1;

        // 현재
        visited[x][y] = 0;

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,1,-1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;

            if (visited[nx][ny] == 1) {
                cnt += dfs(nx,ny);
            }
        }

        return cnt;
    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        visited = new int[n+1][n+1];

        for (int i =1; i <=n; i++) {
            String now = br.readLine();
            for (int j = 1; j <= n; j++) {
                visited[i][j] = now.charAt(j-1) - '0';
            }
        }

        int ans = 0;
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(visited[i][j] == 1) {
                    sb.append(dfs(i,j) + "\n");
                    ans++;
                }
            }
        }

        System.out.println(ans);
        System.out.println(sb.toString());
    }
}