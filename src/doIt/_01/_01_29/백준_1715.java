package doIt._01._01_29;

import java.io.*;
import java.util.*;

public class 백준_1715 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static PriorityQueue<Integer> PQ = new PriorityQueue<>();

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            PQ.add(now);
        }

        long sum = 0;
        while(PQ.size() >= 2) {
            int first = PQ.poll();
            int second = PQ.poll();

            sum += first+second;
            PQ.add(first+second);
        }

        System.out.println(sum);

    }
}