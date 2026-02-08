package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_1926 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static int dfs(int x, int y) {
        int cnt = 1;
        visited[x][y] = true;

        for(int i =0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx > n-1 || ny > m-1) continue;

            if(!visited[nx][ny] && graph[nx][ny]==1) cnt += dfs(nx,ny);
        }
        return cnt;
    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i =0; i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        int max = 0;
        for(int i =0; i<n;i++) {
            for(int j = 0; j <m; j++) {
                if(!visited[i][j] && graph[i][j]==1) {
                    int now = dfs(i,j);
                    max = Math.max(max, now);
                    ans++;
                }
            }
        }

        System.out.println(ans);
        System.out.println(max);
    }
}