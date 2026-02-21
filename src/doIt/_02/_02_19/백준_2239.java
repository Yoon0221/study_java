package doIt._02._02_19;

import java.io.*;
import java.util.*;

public class 백준_2239 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static boolean canPlace(int x, int y, int num) {
        // 행열 검사
        for(int i =0; i <9; i++) if(graph[i][y] - '0' == num) return false;
        for(int i =0; i <9; i++) if(graph[x][i] - '0' == num) return false;

        // 작은 보드 검사
        int sx, ex;
        int sy, ey;
        if(x >=0 && x <=2) {
            sx = 0;
            ex = 2;
        } else if(x >= 3 && x <= 5) {
            sx = 3;
            ex = 5;
        } else {
            sx = 6;
            ex = 8;
        }

        if(y >=0 && y <=2) {
            sy = 0;
            ey = 2;
        } else if(y >= 3 && y <= 5) {
            sy = 3;
            ey = 5;
        } else {
            sy = 6;
            ey = 8;
        }

        for(int i =sx; i <=ex; i++) {
            for(int j = sy; j <= ey; j++) if(graph[i][j] - '0' == num) return false;
        }

        return true;
    }
    static void dfs(int x, int y) {
        if(x == 9) {
            for (int i =0; i<9; i++) {
                for(int j =0; j< 9; j++) {
                    System.out.print(graph[i][j]);
                }
                System.out.println();
            }
            System.exit(0);
        }

        int nx = x;
        int ny = y + 1;
        if(ny == 9) {
            ny = 0;
            nx += 1;
        }

        if (graph[x][y] - '0' != 0) {
            dfs(nx,ny);
            return;
        }

        for(int i =1; i<=9; i++) {
            if (canPlace(x,y,i)) {
                graph[x][y] = (char)(i + '0');
                dfs(nx,ny);
                graph[x][y] = '0';
            }
        }

    }

    static char[][] graph;
    static public void main(String args[]) throws IOException {

        graph = new char[9][9];
        for (int i =0; i<9; i++) {
            String s = br.readLine();
            for(int j =0; j< 9; j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        dfs(0,0);
    }
}