package doIt._02._02_17;

import java.io.*;
import java.util.*;

public class 백준_1194 {

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
    static int S = (int)Math.pow(2,6);
    static int bfs(int sx, int sy) {
        Queue<Node> q = new ArrayDeque<>();
        int[][][] dist = new int[n][m][S];
        for(int i =0; i<n;i++) for(int j =0; j<m; j++) Arrays.fill(dist[i][j], -1);

        q.add(new Node(sx,sy,0));
        dist[sx][sy][0] = 0;

        while(!q.isEmpty()) {
            Node cur = q.poll();
            if(graph[cur.x][cur.y] == '1') return dist[cur.x][cur.y][cur.k];

            for(int i=0; i<4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx <0 || ny <0 || nx >=n || ny >=  m) continue;

                char map = graph[nx][ny];
                int key = cur.k;

                if(map == '#') continue;

                // 열쇠 관련 - 열쇠 취득 or 문 열기
                if(map>='a' && map <= 'f') {
                    int now = map - 'a';
                    key = key | (1<<now); // 특정 칸 활성화
                } else if(map>='A' && map <= 'F') {
                    int now = map - 'A';
                    if( (key & (1<<now)) == 0 ) { // 키가 있으면 가능 아니면 불가
                        continue;
                    }
                }

                // 실제 이동
                if(dist[nx][ny][key] == -1) {
                    dist[nx][ny][key] = dist[cur.x][cur.y][cur.k] + 1;
                    q.add(new Node(nx, ny, key));
                }
            }
        }

        return -1;
    }

    static int n,m;
    static char[][] graph;
    static int sx, sy;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new char[n][m];
        for(int i = 0; i<n; i++) {
            String s = br.readLine();
            for(int j = 0; j <m; j++) {
                graph[i][j] = s.charAt(j);
                if(graph[i][j] == '0') {
                    sx = i;
                    sy = j;
                }
            }
        }

        System.out.println(bfs(sx,sy));
    }
}