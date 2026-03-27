package doIt._03._03_27;

import java.io.*;
import java.util.*;

public class 백준_2164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();
        for(int i =1; i<=n; i++) dq.addLast(i);
        while(true) {
            // 제일 위 버리기
            if(dq.size()==1) break;
            dq.pollFirst();

            // 제일 위 제일 아래로
            if(dq.size()==1) break;
            dq.addLast(dq.pollFirst());
        }

        System.out.println(dq.pollFirst());

    }

}