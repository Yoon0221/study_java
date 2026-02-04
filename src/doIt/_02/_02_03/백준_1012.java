package doIt._02._02_03;

import java.io.*;
import java.util.*;

public class 백준_1012 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int n;
    static int m;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int[][] graph;

    static void dfs(int x, int y) {
        // 현재 방문
        graph[x][y] = 0;
        // 인접 재귀
        for (int i =0; i< 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny <0 || nx > n-1 || ny > m-1) continue;

            if (graph[nx][ny]==1) dfs(nx,ny);
        }
    }

    static public void main(String args[]) throws IOException {

        int test = Integer.parseInt(br.readLine());
        for (int t = 0; t <test; t++) {

            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 가로
            n = Integer.parseInt(st.nextToken()); // 세로
            int k = Integer.parseInt(st.nextToken()); // 1의 갯수

            graph = new int[n][m];
            for (int i = 0; i<k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[y][x] = 1;
            }

            int ans = 0;
            for (int i = 0; i<n; i++) {
                for (int j = 0; j<m; j++) {
                    if (graph[i][j] == 1) {
                        dfs(i,j);
                        ans++;
                    }
                }
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb.toString());
    }

}