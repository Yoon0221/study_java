package doIt._02._02_03;

import java.io.*;
import java.util.*;

public class 백준_2667 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<Integer> per_ans;

    static int n;
    static int[][] graph;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int dfs(int x, int y) {

        int cnt = 1;

        // 현재 방문
        graph[x][y] = 0;
        // 인접 재귀
        for (int i =0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx <0 || ny <0 || nx > n-1 || ny > n-1) continue;

            if (graph[nx][ny] == 1) cnt += dfs(nx,ny);
        }

        return cnt;
    }

    static public void main(String args[]) throws IOException {

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        for (int i = 0; i<n; i++) { // 행. 세로
            String now = br.readLine();
            for (int j = 0; j <n; j++) { // 열. 가로
                graph[i][j] = Integer.parseInt(now.substring(j,j+1));
            }
        }

        int ans = 0;
        per_ans = new ArrayList<>();
        for (int i = 0; i<n; i++) { // 행. 세로
            for (int j = 0; j <n; j++) { // 열. 가로
                if (graph[i][j] == 1) {
                    per_ans.add(dfs(i,j));
                    ans++;
                }
            }
        }

        System.out.println(ans);
        Collections.sort(per_ans);
        for (int i : per_ans) {
            System.out.println(i);
        }
    }
}