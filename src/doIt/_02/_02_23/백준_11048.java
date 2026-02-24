package doIt._02._02_23;

import java.io.*;
import java.util.*;

public class 백준_11048 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] graph = new int[n+1][m+1];
        int[] dx = {1, 0,1};
        int[] dy = {0,1,1};

        int INF = -1000;
        int[][] dp = new int[n+1][m+1];
        for(int i =1; i<=n; i++) Arrays.fill(dp[i], INF);
        dp[1][1] = 0;

        for(int i =1; i<=n; i++) {
            for(int j = 1; j <=m; j++) {

                for(int k = 0; k<3; k++) {

                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    dp[i][j] = Math.max(dp[i][j], dp[nx][ny] + 1);
                }

            }
        }

        System.out.println(dp[n][m]);
    }
}