package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_2468 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int max = 0;

    static void dfs(int x, int y, int depth) {
        // 현재
        visited[x][y] = true;
        // 인접
        for (int i =0; i< 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx > n-1 || ny > n-1) continue;

            if(!visited[nx][ny] && graph[nx][ny] > depth)dfs(nx,ny,depth);
        }
    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j <n; j++) {
                int now = Integer.parseInt(st.nextToken());
                max = Math.max(max,now);
                graph[i][j] = now;
            }
        }

        int ans = 0;

        for (int depth = 0; depth <= max; depth++) {
            int cnt = 0;
            visited = new boolean[n][n];
            for (int i = 0; i<n; i++) {
                for(int j =0; j <n; j++) {
                    if (!visited[i][j] && graph[i][j] > depth) {
                        dfs(i,j,depth);
                        cnt ++;
                    }
                }
            }
            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);
    }
}