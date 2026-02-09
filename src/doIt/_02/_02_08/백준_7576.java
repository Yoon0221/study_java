package doIt._02._02_08;

import java.io.*;
import java.util.*;

public class 백준_7576 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n, m;
    static int[][] graph;

    static int target;
    static int cnt;

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    // 확산 bfs
    // 시작 큐에 1인 것들을 모두 넣는다.
    static int bfs() {

        if (cnt == target) return 0;

        Queue<int []> q = new ArrayDeque<>();
        int[][] dist = new int[n][m];
        for(int i =0; i<n; i++) Arrays.fill(dist[i], -1);

        for(int i = 0; i<n; i++) {
            for(int j = 0; j < m ; j++) {
                if(graph[i][j] == 1) {
                    q.add(new int[] {i,j});
                    dist[i][j] = 0;
                }
            }
        }

        while(!q.isEmpty()) {

            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i =0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny <0 || nx >= n || ny >= m) continue;

                // 미방문 & 익지 않은 토마토가 있는 곳
                if(dist[nx][ny] == -1 && graph[nx][ny] == 0) {
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new int[] {nx,ny});
                    cnt++;
                    if (cnt == target) return dist[nx][ny];
                }
            }
        }

        return -1;

    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 가로
        n = Integer.parseInt(st.nextToken()); // 세로

        graph = new int[n][m];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m ; j++) {
                int now = Integer.parseInt(st.nextToken());
                graph[i][j] = now;
                if(now == 0) target++;
            }
        }

        System.out.println(bfs());

    }

}