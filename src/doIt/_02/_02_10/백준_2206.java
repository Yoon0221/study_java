package doIt._02._02_10;

import java.io.*;
import java.util.*;

public class 백준_2206 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n,m;
    static int[][] graph;

    static class Node{
        int x, y;
        int state;
        Node(int x, int y, int state) {
            this.x = x;
            this.y = y;
            this.state = state;
        }
    }

    static boolean canMove(int state, int nx, int ny, int nextState) {
        // 1. 0에서 진행 -> 상태가 같게 이동
        if(graph[nx][ny] == 0 && nextState == state) return true;
        // 2. 1에서 진행 -> 벽을 부수고 이동
        if(graph[nx][ny] == 1 && state == 0 && nextState == 1) return true;

        return false;
    }

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int S = 2; // 0 == 벽 0개 뿌심 1 == 벽 1개 뿌심
    static int bfs(int sx, int sy, int initState, int ex, int ey) {
        Queue<Node> q = new ArrayDeque<>();
        int[][][] dist = new int[n][m][S];
        for(int i =0; i<n; i++) {
            for(int j =0; j<m; j++) {
                Arrays.fill(dist[i][j], -1);
            }
        }

        q.add(new Node(sx, sy, initState));
        dist[sx][sy][initState] = 1;

        while(!q.isEmpty()) {
            Node cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            int state = cur.state;

            if(x == ex && y == ey) return dist[x][y][state];

            for(int i =0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >=n || ny >= m) continue;

                for(int nextState = 0; nextState < S; nextState++) {
                    if (!canMove(state, nx,ny,nextState)) continue;

                    if(dist[nx][ny][nextState] == -1) {
                        dist[nx][ny][nextState] = dist[x][y][state] + 1;
                        q.add(new Node(nx, ny, nextState));
                    }
                }

            }
        }

        return -1;
    }

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        for(int i =0; i<n; i++) {
            String s = br.readLine();
            for(int j =0; j<m;j++) graph[i][j] = s.charAt(j) - '0';
        }

        System.out.println(bfs(0,0,0,n-1,m-1));

    }
}