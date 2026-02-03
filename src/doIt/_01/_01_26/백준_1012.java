package doIt._01._01_26;

import java.io.*;
import java.util.*;

public class 백준_1012 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int[][] visited;

    static int N;
    static int M;

    static void dfs(int x, int y) {

        // 현재
        visited[x][y] = 0;

        // 인접 재귀
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        for (int i = 0; i <4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0|| ny < 0 || nx >N-1 || ny >M-1) continue;

            if (visited[nx][ny]==1) dfs(nx,ny);
        }
    }

    static public void main(String args[]) throws IOException {

        int T = Integer.parseInt(br.readLine());

        for (int i =0; i<T; i++) {

            int ans = 0;

            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            int K = Integer.parseInt(st.nextToken());

            visited = new int[N][M];
            for (int j =0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken()); // 가로
                int Y = Integer.parseInt(st.nextToken()); // 세로

                visited[Y][X] = 1;
            }

            // dfs 해서 연결 개수 세기
            for (int j =0; j<N; j++) {
                for (int k =0; k<M; k++) {
                   if (visited[j][k]==1) {
                       dfs(j,k);
                       ans++;
                   }
                }
            }

            sb.append(ans + "\n");
        }

        System.out.println(sb.toString());
    }
}