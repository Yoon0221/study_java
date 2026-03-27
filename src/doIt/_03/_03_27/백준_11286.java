package doIt._03._03_27;

import java.io.*;
import java.util.*;

public class 백준_11286 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                // 절댓값이 작은 순 - 오름차순
                int absA = Math.abs(a);
                int absB = Math.abs(b);

                if (absA == absB) {
                    // 절댓값이 같으면 작은 순 - 오름차순
                    return Integer.compare(a,b);
                } else return Integer.compare(absA, absB);
            }
    );

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            if(now == 0) {
                if(pq.size() == 0) sb.append(0 + "\n");
                else sb.append(pq.poll() + "\n");
            } else pq.add(now);
        }

        System.out.println(sb.toString());

    }

}