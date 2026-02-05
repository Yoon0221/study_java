package doIt._02._02_04;

import java.io.*;
import java.util.*;

public class 백준_2468 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer> ans = new ArrayList<>();

    static int[][] graph;
    static int[][] now_graph;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    static int n;

    static void dfs(int x, int y) {
        // 현재
        now_graph[x][y] = 0;
        // 인접
        for(int i =0; i< 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > n-1 || ny > n-1) continue;

            if (now_graph[nx][ny] == 1) dfs(nx, ny);
        }
    }

    static public void main(String args[]) throws IOException {

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        int max_h = 0;
        for (int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j =0; j<n; j++) {
                int now = Integer.parseInt(st.nextToken());
                if (now > max_h) max_h = now;
                graph[i][j] = now;
            }
        }

        for (int test =0; test<=max_h; test++) {

            now_graph = new int[n][n];
            for (int i =0; i<n; i++) {
                for (int j =0; j<n; j++) {
                    if(graph[i][j] > test) {
                        now_graph[i][j] = 1;
                    } else now_graph[i][j] = 0;
                }
            }

            int cnt = 0;
            for (int i =0; i<n; i++) {
                for (int j =0; j<n; j++) {
                    if(now_graph[i][j] == 1) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }

            ans.add(cnt);
        }

        int max = 0;
        for (int i : ans) {
            if (i > max) max = i;
        }

        System.out.println(max);

    }

}