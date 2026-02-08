package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_4963 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[][] graph;
    static int w;
    static int h;

    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,1,-1,1,-1};

    static void dfs(int x, int y) {
        // 현재
        graph[x][y] = 0;
        // 인접
        for(int i = 0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny <0 || nx > h-1 || ny > w-1) continue;

            if(graph[nx][ny] == 1) dfs(nx, ny);
        }
    }

    static public void main(String args[]) throws IOException {

        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); // 가로
            h = Integer.parseInt(st.nextToken()); // 세로

            if (w == 0 && h == 0) break;

            graph = new int[h][w];
            for (int i = 0; i <h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j <w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int ans = 0;
            for (int i = 0; i <h; i++) {
                for (int j = 0; j <w; j++) {
                    if(graph[i][j] == 1) {
                        dfs(i,j);
                        ans++;
                    }
                }
            }

            sb.append(ans + "\n");
        }

        System.out.println(sb.toString());

    }
}