package doIt._02._02_19;

import java.io.*;
import java.util.*;

public class 백준_18430 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] dx = {-1,1,-1,1};
    static int[] dy = {0,0,0,0};
    static int[] ddx = {0,0,0,0};
    static int[] ddy = {-1,-1,1,1};

    static int place(int x, int y, int x2, int y2, int x3, int y3) {
        visited[x][y] = true;
        visited[x2][y2] = true;
        visited[x3][y3] = true;

        return (graph[x][y] * 2) + graph[x2][y2] + graph[x3][y3];
    }

    static void unplace(int x, int y, int x2, int y2, int x3, int y3) {
        visited[x][y] = false;
        visited[x2][y2] = false;
        visited[x3][y3] = false;
    }

    // 각 칸을 가운데로 선택 or 비선택
    static int max = 0;
    static void dfs(int x, int y, int total) {
        if (x == n) {
            max = Math.max(total,max);
            return;
        }

        int nx = x;
        int ny = y + 1;
        if(ny == m) {
            ny = 0;
            nx = nx + 1;
        }

        // 선택
        for(int i =0; i<4; i++) {

            // 특정 x,y 가 가운데, d방향
            int x2 = x + dx[i];
            int x3 = x + ddx[i];
            int y2 = y + dy[i];
            int y3 = y + ddy[i];

            if (x2 <0 || y2 < 0 || x2 >=n || y2>=m) continue;
            if (x3 <0 || y3 < 0 || x3 >=n || y3>=m) continue;

            if (visited[x][y] || visited[x2][y2] || visited[x3][y3]) continue;

            int cost = place(x,y,x2,y2,x3,y3);
            dfs(nx, ny, total + cost);
            unplace(x,y,x2,y2,x3,y3);

        }

        // 비선택
        dfs(nx, ny, total);
    }

    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i= 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,0);
        System.out.println(max);

    }
}