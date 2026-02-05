package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_2573 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] graph;
    static boolean[][] visited;
    static int n;
    static int m;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    // 빙산 개수 세기
    static int how_many() {
        int ans = 0;

        visited = new boolean[n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if((!visited[i][j]) && graph[i][j] > 0) {
                    dfs(i,j);
                    ans++;
                }
            }
        }

        return ans;
    }

    static void dfs(int x, int y) {
        // 현재
        visited[x][y] = true;
        // 인접
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0|| nx > n-1 || ny > m-1) continue;

            if (!visited[nx][ny] && graph[nx][ny] > 0) dfs(nx, ny);
        }
    }

    // 빙산 녹음 + 남은 빙산 개수 return
    static int melt() {

        int[][] how_melt = new int[n][m];

        // 4방향 0의 갯수 세서 저장하기
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {

                for (int p = 0; p < 4; p++) {
                    int nx = i + dx[p];
                    int ny = j + dy[p];

                    if (nx < 0 || ny < 0|| nx > n-1 || ny > m-1) continue;

                    if (graph[nx][ny] == 0) how_melt[i][j]++;
                }
            }
        }

        // 실제로 녹기
        int cnt = 0;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                int now = graph[i][j] - how_melt[i][j];
                if (now < 0) now = 0;
                if (now != 0) cnt++;
                graph[i][j] = now;
            }
        }

        return cnt;
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        graph = new int[n][m];
        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        while(true) {
            if (how_many() > 1) break;
            if (melt() == 0) {
                ans = 0;
                break;
            }
            ans++;
        }
        System.out.println(ans);

    }

}