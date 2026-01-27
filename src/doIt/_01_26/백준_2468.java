package doIt._01_26;

import java.io.*;
import java.util.*;

public class 백준_2468 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] visited;
    static int[][] graph;
    static int n;

    static void dfs(int x, int y) {
        // 현재
        visited[x][y] = 0;

        // 인접 재귀
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for (int i =0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y+dy[i];

            if (nx < 0 || ny < 0 || nx > n-1 || ny > n-1) continue;

            if (visited[nx][ny] == 1) dfs(nx,ny);
        }
    }
    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];

        for (int i=0; i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<n;j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for (int a =1; a < n+1; a++) {

            visited = new int[n][n];
            for (int i=0; i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (graph[i][j] > a) visited[i][j] = 1;
                    else visited[i][j] = 0;
                }
            }

            int cnt = 0;
            for (int i=0; i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (visited[i][j] ==1) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }

            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);
    }
}