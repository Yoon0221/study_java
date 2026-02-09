package doIt._02._02_08;

import java.io.*;
import java.util.*;

public class 백준_1697 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static long bfs(int start, int target) {
        Queue<Integer> q = new ArrayDeque<>();
        long[] dist = new long[100001];
        Arrays.fill(dist, -1);

        q.add(start);
        dist[start] = 0;

        while(!q.isEmpty()) {
            int cur = q.poll();
            if (cur == target) return dist[cur];

            // 앞으로 걷기
            if (100001 > cur+1 && cur+1 >= 0 && dist[cur+1] == -1) {
                dist[cur+1] = dist[cur] + 1;
                q.add(cur+1);
            }

            // 뒤로 걷기
            if (100001 > cur-1 && cur-1 >= 0 && dist[cur-1] == -1) {
                dist[cur-1] = dist[cur] + 1;
                q.add(cur-1);
            }

            // 순간이동
            if (100001 > cur*2 && cur*2 >= 0 && dist[cur*2] == -1) {
                dist[cur*2] = dist[cur] + 1;
                q.add(cur*2);
            }

        }

        return -1;
    }

    static int n;
    static int k;

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n,k));

    }
}