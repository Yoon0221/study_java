package doIt._02._02_17;

import java.io.*;
import java.util.*;

public class 백준_16920 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class Node {
        int x,y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean bfs() {
        // 모든 플레이어가 1차례씩. 가속도는 max_far
        // 누구라도 움직이면 맵 수정 & return (end=false)
        boolean end = true;

        for(int player = 1; player<= p; player++) {

            for(int i = 0; i<max_far[player-1]; i++) {

                int now_size = qList[player-1].size();
                if(now_size == 0) break;

                while(now_size-- >0) {
                    Node cur = qList[player-1].poll();

                    for(int j =0; j <4; j++) {
                        int nx = cur.x + dx[j];
                        int ny = cur.y + dy[j];
                        if (nx <0 || ny <0 || nx >=n || ny >=m) continue;

                        if (graph[nx][ny] == '.') {
                            graph[nx][ny] = (char)(player+'0');
                            qList[player-1].add(new Node(nx,ny));
                            end = false;
                        }
                    }
                }
            }

        }

        return end;
    }

    static Queue<Node>[] qList;
    static int n,m,p;
    static int[] max_far;
    static char[][] graph;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        max_far = new int[p];
        for(int i=0; i<p; i++) max_far[i] = Integer.parseInt(st.nextToken());

        graph = new char[n][m];
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        // 큐 생성 및 초기 값 넣기
        qList = new ArrayDeque[p];
        for(int i =0; i<p; i++) qList[i] = new ArrayDeque<>();
        for(int player = 1; player<= p; player++) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(graph[i][j] == (char)(player+'0') ) qList[player-1].add(new Node(i,j));
                }
            }
        }

        while(true) {
            if(bfs()) break;
        }

        for(int player = 1; player<= p; player++) {
            int cnt = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(graph[i][j] == (char)(player+'0') ) cnt++;
                }
            }
            sb.append(cnt + " ");
        }

        System.out.println(sb.toString());

    }
}