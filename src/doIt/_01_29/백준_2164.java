package doIt._01_29;

import java.io.*;
import java.util.*;

public class 백준_2164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> DQ = new ArrayDeque<>();
        for(int i =1; i<= n; i++) DQ.addLast(i);

        while (true) {
            if (DQ.size() == 1) break;
            DQ.pollFirst();
            if (DQ.size() == 1) break;
            DQ.addLast(DQ.pollFirst());
        }

        System.out.println(DQ.poll());

    }
}