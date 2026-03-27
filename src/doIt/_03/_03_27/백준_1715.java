package doIt._03._03_27;

import java.io.*;
import java.util.*;

public class 백준_1715 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                return Integer.compare(a,b);
            }
    );

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            pq.add(now);
        }

        int sum = 0;
        while(true) {
            // 더한 수도 다시 넣고 그거 포함 가장 작은 수 2개씩 더하기

            if (pq.size() == 1) break;
            int s1 = pq.poll();
            int s2 = pq.poll();

            sum += s1 + s2;
            pq.add(s1 + s2);
        }

        System.out.println(sum);
    }

}