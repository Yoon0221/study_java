package doIt._01._01_26;

import java.io.*;
import java.util.*;

public class 백준_4963 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[][] visited;
    static int w;
    static int h;

    static void dfs(int x, int y) {
        // 현재
        visited[x][y] = 0;

        // 인접 재귀 - 대각선
        int[] dx = {-1,1,0,0,-1,-1,1,1};
        int[] dy = {0,0,1,-1,1,-1,-1,1};
        for (int i =0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0|| nx > h-1 || ny > w-1) continue;

            if (visited[nx][ny] == 1) dfs(nx,ny);
        }
    }

    static public void main(String args[]) throws IOException {

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 || h ==0) break;

            visited = new int[h][w];
            for (int i = 0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w;j++) {
                    visited[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // dfs 로 연결개수 구하고 sb 저장
            int cnt = 0;
            for (int i = 0; i<h; i++) {
                for(int j=0; j<w;j++) {
                   if(visited[i][j] == 1) {
                       dfs(i,j);
                       cnt++;
                   }
                }
            }

            sb.append(cnt + "\n");

        }

        System.out.println(sb.toString());

    }
}