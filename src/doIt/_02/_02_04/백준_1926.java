package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_1926 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] graph;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static int n;
    static int m;

    static int dfs(int x, int y) {
        int cnt = 1;

        // 현재
        graph[x][y] = 0;
        // 인접
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > n-1 || ny > m-1) continue;

            if (graph[nx][ny] == 1) cnt += dfs(nx,ny);
        }

        return cnt;
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(graph[i][j] == 1) {
                    int cnt = dfs(i,j);
                    if (cnt > max) max = cnt;
                    ans++;
                }
            }
        }

        System.out.println(ans);
        System.out.println(max);

    }

}