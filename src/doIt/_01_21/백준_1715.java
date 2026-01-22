package doIt._01_21;

import java.io.*;
import java.util.*;

public class 백준_1715 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static PriorityQueue<Integer> PQ = new PriorityQueue<>();

    static public void main(String agrs[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());
            PQ.add(now);
        }

        // 작은 수부터 2개씩 더하고 다시 PQ 넣기 & sum 에 더하기
        long sum = 0;
        while(PQ.size()>=2) {
            int f = PQ.poll();
            int s = PQ.poll();
            int merge = f + s;
            sum += merge;
            PQ.add(merge);
        }

        // 남은 PQ -> 1 혹은 0
        // 근데 N 이 1보다 큼 -> 0 불가
        // 1 -> 이미 merge 로 더해짐
        System.out.println(sum);

    }

}