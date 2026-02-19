package doIt._02._02_18;

import java.io.*;
import java.util.*;

public class 백준_18430 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // 특정 나무 방문
    static int place(int x, int y, int nx, int ny, int nnx, int nny) {
        int sum = (2 * graph[x][y]) + graph[nx][ny] + graph[nnx][nny];
        visited[x][y] = true;
        visited[nx][ny] = true;
        visited[nnx][nny] = true;
        return sum;
    }

    // 특정 나무 방문 취소
    static void unplace(int x, int y, int nx, int ny, int nnx, int nny) {
        visited[x][y] = false;
        visited[nx][ny] = false;
        visited[nnx][nny] = false;
    }

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,1};
    static int[] ddx = {0,0,-1,1};
    static int[] ddy = {-1,-1,0,0};
    static int max = 0;
    static void dfs(int x, int y, int total) {
        if(x == n) {
            max = Math.max(max, total);
            return;
        }

        // 다음에 넘길 중심 x,y
        int nx = x;
        int ny = y+1;
        if (ny == m) {
            ny = 0;
            nx = x + 1;
        }

        // 비선택
        dfs(nx,ny,total);

        // 선택
        if (!visited[x][y]) {
            for(int k = 0; k<4; k++) {
                int x2 = x + dx[k];
                int y2 = y + dy[k];
                int x3 = x + ddx[k];
                int y3 = y + ddy[k];

                if(x2 < 0 || y2 <0 || x2 >=n || y2 >=m) continue;
                if (visited[x2][y2]) continue; // 이미 방문한 곳이면 pass
                if(x3 < 0 || y3 <0 || x3 >=n || y3 >=m) continue;
                if (visited[x3][y3]) continue; // 이미 방문한 곳이면 pass

                int cost = place(x,y,x2,y2,x3,y3);
                dfs(nx,ny,total + cost);
                unplace(x,y,x2,y2,x3,y3);
            }
        }

    }

    static int n,m;
    static int[][] graph;
    static boolean[][] visited;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,0);
        System.out.println(max);

    }
}