package doIt._02._02_13;

import java.io.*;
import java.util.*;

public class 백준_1600 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Node {
        int x, y, k;
        Node(int x, int y, int k) {
            this.x = x;
            this.y = y;
            this.k = k;
        }
    }

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int[] ddx = {-2,-2,2,2,-1,-1,1,1};
    static int[] ddy = {-1,1,-1,1,-2,2,-2,2};

    static int bfs(int sx, int sy, int initState, int ex, int ey) {
        Queue<Node> q = new ArrayDeque<>();
        int[][][] dist = new int[h][w][k+1];
        for(int i =0; i < h; i++) {
            for(int j = 0; j<w;j++) Arrays.fill(dist[i][j], -1);
        }

        q.add(new Node(sx, sy, initState));
        dist[sx][sy][initState] = 0;

        while(!q.isEmpty()) {
            Node cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            int state = cur.k;

            if(x == ex && y == ey) return dist[x][y][state];

            // state 가 0이면 상하좌우만 가능
            // state 가 1이상이면 말처럼 이동 & 상하좌우 모두 가능
            for(int i =0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0|| ny <0 || nx >= h || ny >= w) continue;
                if(graph[nx][ny] == 1) continue;

                if(dist[nx][ny][state] == -1) {
                    dist[nx][ny][state] = dist[x][y][state] + 1;
                    q.add(new Node(nx,ny,state));
                }
            }

            if (state > 0) {
                for(int i =0; i<8; i++) {
                    int nx = x + ddx[i];
                    int ny = y + ddy[i];

                    if(nx < 0|| ny <0 || nx >= h || ny >= w) continue;
                    if(graph[nx][ny] == 1) continue;

                    int newState = state - 1;
                    if(dist[nx][ny][newState] == -1) {
                        dist[nx][ny][newState] = dist[x][y][state] + 1;
                        q.add(new Node(nx,ny,newState));
                    }
                }
            }

        }

        return -1;
    }



    static int k, w, h;
    static int[][] graph;
    static public void main(String args[]) throws IOException {

        k = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken()); // 가로
        h = Integer.parseInt(st.nextToken()); // 세로

        graph = new int[h][w];
        for(int i =0; i<h; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<w; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs(0,0,k,h-1,w-1));

    }
}