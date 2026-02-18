package doIt._02._02_17;

import java.io.*;
import java.util.*;

public class 백준_3055 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int bfs(int sx, int sy) {
        Queue<Node> go = new ArrayDeque<>(); // 고슴도치
        Queue<Node> wa = new ArrayDeque<>(); // 물

        go.add(new Node(sx,sy));
        for(int i=0; i<n; i++) {
            for(int j =0; j<m; j++) {
                if (graph[i][j] == '*') wa.add(new Node(i,j));
            }
        }

        int time = 0;
        while(!go.isEmpty()) {

            // 물 이동
            int waterSize = wa.size();
            while(waterSize-- >0) {
                Node cur = wa.poll();
                for(int i =0; i<4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if(nx < 0 || ny <0 || nx >=n || ny >=m) continue;

                    if(graph[nx][ny] == '.' || graph[nx][ny] == 'S') {
                        graph[nx][ny] = '*';
                        wa.add(new Node(nx,ny));
                    }
                }
            }

            // 고슴도치 이동
            int GoSize = go.size();
            while(GoSize-- >0) {
                Node cur = go.poll();
                for(int i =0; i<4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if(nx < 0 || ny <0 || nx >=n || ny >=m) continue;

                    if(graph[nx][ny] == '.') {
                        graph[nx][ny] = 'S';
                        go.add(new Node(nx,ny));
                    }

                    if(graph[nx][ny] == 'D') {
                        return time+1;
                    }
                }
            }

            time++;
        }

        return -1;
    }

    static int n,m;
    static char[][] graph;
    static int sx, sy;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        graph = new char[n][m];
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j =0; j<m; j++) {
                graph[i][j] = s.charAt(j);
                if(graph[i][j] == 'S') {
                    sx = i;
                    sy = j;
                }
            }
        }

        int ans = bfs(sx,sy);
        if (ans == -1) System.out.println("KAKTUS");
        else System.out.println(ans);

    }
}