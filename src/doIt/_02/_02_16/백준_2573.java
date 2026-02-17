package doIt._02._02_16;

import java.io.*;
import java.util.*;

public class 백준_2573 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static void bfs(int sx, int sy) {
        Queue<Node> q = new ArrayDeque<>();

        q.add(new Node(sx,sy));
        visited[sx][sy] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            for(int i =0; i<4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (!visited[nx][ny] && graph[nx][ny] > 0) {
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny));
                }
            }
        }

    }

    // 현재 빙산의 갯수 세기
    static int countIce() {
        int cnt = 0;
        visited = new boolean[n][m];
        for(int i =0; i< n; i++) {
            for(int j=0; j<m; j++) {
                if(!visited[i][j] && graph[i][j] > 0) {
                    bfs(i,j);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    // 1년 지나기 - 4방향 0의 갯수만큼 녹기
    static void melt() {

        int[][] minus = new int[n][m];

        for(int i =0; i< n; i++) {
            for(int j=0; j<m; j++) {

                int now = 0;
                for(int k =0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    if (graph[nx][ny] == 0) now++;
                }
                minus[i][j] = now;
            }
        }

        for(int i =0; i< n; i++) {
            for(int j=0; j<m; j++) {
                graph[i][j] -= minus[i][j];
                if (graph[i][j] < 0) graph[i][j] = 0;
            }
        }

    }

    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        graph = new int[n][m];
        for(int i =0; i< n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) graph[i][j] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        while(true) {
            int how_many = countIce();
            if(how_many > 1) {
                System.out.println(ans);
                break;
            }
            if(how_many == 0) {
                System.out.println(0);
                break;
            }
            melt();
            ans++;
        }

    }
}