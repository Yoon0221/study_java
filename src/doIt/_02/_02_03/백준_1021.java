package doIt._02._02_03;

import java.io.*;
import java.util.*;

public class 백준_1021 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static Deque<Integer> DQ;

    static int move(int target) {

        int left = countLeft(target)-1;
        int right = DQ.size() - left;

        int num = 0;
        if (left != 0) {
            if (left <= right) { // 2번 연산
                for (int i =0; i< left; i++) DQ.addLast(DQ.pollFirst());
                num = left;
            } else { // 3번 연산
                for (int i =0; i< right; i++) DQ.addFirst(DQ.pollLast());
                num = right;
            }
        }

        // 1번 연산
        DQ.pollFirst();

        return num;
    }

    static int countLeft(int target) {
        int num = 0;
        for (int i : DQ) {
            num++;
            if (i == target) break;
        }
        return num;
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        DQ = new ArrayDeque<>();
        for (int i = 1; i<=n; i++) DQ.add(i);

        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            int now = Integer.parseInt(st.nextToken());
            int how_many_move = move(now);
            ans += how_many_move;
        }

        System.out.println(ans);
    }

}