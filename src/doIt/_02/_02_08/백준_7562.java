package doIt._02._02_08;

import java.io.*;
import java.util.*;

public class 백준_7562 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int I;
    static int sx, sy;
    static int ex, ey;

    static int[] dx = {2,2,1,1,-1,-1,-2,-2};
    static int[] dy = {-1,1,-2,2,-2,2,-1,1};

    static int bfs(int sx, int sy, int ex, int ey) {
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dist = new int[I][I];
        for(int i =0; i< I; i++) Arrays.fill(dist[i], -1);

        q.add(new int[] {sx, sy});
        dist[sx][sy] = 0;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == ex && y == ey) return dist[x][y];

            for(int i =0; i<8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx > I-1 || ny > I-1) continue;

                if (dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new int[] {nx, ny});
                }
            }
        }

        return -1;
    }

    static public void main(String args[]) throws IOException {

        int t = Integer.parseInt(br.readLine());

        for (int i =0; i<t; i++) {
            I = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            sx = Integer.parseInt(st.nextToken());
            sy = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            ex = Integer.parseInt(st.nextToken());
            ey = Integer.parseInt(st.nextToken());

            sb.append(bfs(sx,sy,ex,ey) + "\n");
        }

        System.out.println(sb.toString());

    }
}