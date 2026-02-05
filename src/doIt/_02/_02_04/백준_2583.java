package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_2583 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer> cnt = new ArrayList<>();

    static int[][] graph;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    static int n;
    static int m;

    static int dfs(int x, int y) {

        int cnt = 1;

        // 현재
        graph[x][y] = 1;
        // 인접
        for (int i =0; i< 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > m-1 || ny > n-1) continue;

            if (graph[nx][ny] == 0) cnt += dfs(nx,ny);
        }

        return cnt;
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 세로
        n = Integer.parseInt(st.nextToken()); // 가로
        int k = Integer.parseInt(st.nextToken());

        graph = new int[m][n];
        for (int i =0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int l_x = Integer.parseInt(st.nextToken());
            int l_y = Integer.parseInt(st.nextToken());
            l_y = m - l_y;
            int r_x = Integer.parseInt(st.nextToken());
            int r_y = Integer.parseInt(st.nextToken());
            r_y = m - r_y;

            for (int j = r_y; j < l_y; j++) {
                for (int p = l_x; p < r_x; p++) {
                    graph[j][p] = 1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(graph[i][j] == 0 ) {
                    cnt.add(dfs(i,j));
                    ans++;
                }
            }

        }

        System.out.println(ans);
        Collections.sort(cnt);
        for (int i : cnt) System.out.print(i + " ");

    }

}