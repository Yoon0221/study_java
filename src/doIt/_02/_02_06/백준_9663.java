package doIt._02._02_06;

import java.io.*;
import java.util.*;

public class 백준_9663 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int n;
    static int[][] graph;

    // 전체를 보고 place(후보)가 가능한지 판단.
    static boolean canPlace(int depth, int y) {
        // 세로, 양대각선을 보면서 0이외에 아무것도 없는지 확인
        for(int i = 0; i<depth; i++) {
            // 세로
            if(graph[i][y] != 0) return false;

            int d = depth - i;
            // 기울기 1 대각선
            if (y-d >= 0 && y-d < n) if(graph[i][y-d] != 0) return false;

            // 기울기 -1 대각선
            if (y+d >= 0 && y+d < n) if(graph[i][y+d] != 0) return false;

        }
        return true;
    }

    // 현재 선택에 대해서만 진행
    static void place(int depth, int y) {
        graph[depth][y] = 1;
    }

    // 현재 선택에 대해서만 복구
    static void unplace(int depth, int y) {
        graph[depth][y] = 0;
    }

    static int cnt = 0;
    static void dfs(int depth) {

        if(depth==n) {
            cnt++;
            return;
        }

        for(int i =0; i<n; i++) {
            if(!canPlace(depth,i)) continue;

            place(depth,i);
            dfs(depth+1);
            unplace(depth,i);
        }
    }

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        for(int i =0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                graph[i][j] = 0;
            }
        }

        dfs(0);
        System.out.println(cnt);

    }
}