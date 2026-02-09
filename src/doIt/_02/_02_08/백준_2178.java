package doIt._02._02_08;

import java.io.*;
import java.util.*;

public class 백준_2178 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int bfs(int sx, int sy, int ex, int ey) {
        Queue<Node> q = new ArrayDeque<>();
        int[][] dist = new int[n][m];
        for(int i=0; i<n;i++) Arrays.fill(dist[i], -1);

        q.add(new Node(sx, sy));
        dist[sx][sy] = 1;

        while(!q.isEmpty()) {
            Node cur = q.poll();
            int x = cur.x;
            int y = cur.y;

            if(x == ex && y == ey) return dist[x][y];

            for(int i =0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || ny <0|| nx > n-1 || ny >m-1) continue;
                if (dist[nx][ny] == -1 && graph[nx][ny] == 1) {
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new Node(nx, ny));
                }
            }
        }

        return -1;
    }

    static int n;
    static int m;
    static int[][] graph;

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        graph = new int[n][m];
        for(int i =0; i<n; i++) {
            String s = br.readLine();
            for(int j =0; j<m; j++) graph[i][j] = Integer.parseInt(s.substring(j,j+1));
        }

        System.out.println(bfs(0,0,n-1,m-1));

    }

}