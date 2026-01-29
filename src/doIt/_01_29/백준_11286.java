package doIt._01_29;

import java.io.*;
import java.util.*;

public class 백준_11286 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static PriorityQueue<Integer> PQ = new PriorityQueue<>(
            (a,b) -> {
                int abs_a = Math.abs(a);
                int abs_b = Math.abs(b);

                if (abs_a == abs_b) return Integer.compare(a, b);

                return Integer.compare(abs_a, abs_b);
            }
    );

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now != 0) {
                PQ.add(now);
            } else {
                if (PQ.size() == 0) sb.append(0 + "\n");
                else sb.append(PQ.poll() + "\n");
            }
        }

        System.out.println(sb.toString());

    }
}