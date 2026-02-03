package doIt._01._01_21;

import java.io.*;
import java.util.*;

public class 백준_11286 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static PriorityQueue<Integer> PQ = new PriorityQueue<>((a,b) -> {
        // 절댓값이 같으면, 둘 중 작은 수부터 (=오름차순)
        if (Math.abs(a)==Math.abs(b)) return Integer.compare(a,b);

        // 절댓값이 다르면, 둘 중 절댓값이 작은 수부터 (=오름차순)
        return Integer.compare(Math.abs(a),Math.abs(b));
    });

    static void UsePQ(int num) {
        if (num == 0) {
            if (PQ.isEmpty()) System.out.println("0");
            else System.out.println(PQ.poll());
        } else PQ.add(num);
    }

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            int now = Integer.parseInt(br.readLine());
            UsePQ(now);
        }
    }
}