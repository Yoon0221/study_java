package doIt.chap02;

import java.util.*;
import java.io.*;

public class quiz_11286 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myque = new PriorityQueue<>(
                (a,b) -> {
                    int first = Math.abs(a);
                    int second = Math.abs(b);

                    // 절댓값이 같으면 더 작은 수 부터 (- 이면 왼쪽 리턴)
                    if (first == second) return a-b;

                    // 절댓값이 작은 수 부터
                    return first - second;
                }
        );

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            if (now == 0)
            {
                if (myque.isEmpty())
                    bw.append("0\n");
                else
                    bw.append(myque.poll() + "\n");
            } else
                myque.add(now);
        }

        br.close();
        bw.flush();
    }
}
