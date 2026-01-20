package doIt._01_20;

import java.io.*;
import java.util.*;

public class 백준_2164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(queue.size() > 2) {
            queue.poll();
            queue.add(queue.poll());
        }

        // 1 혹은 2개 남음
        if(queue.size()==1)
            System.out.println(queue.poll());
        else {
            queue.poll();
            System.out.println(queue.poll());
        }

    }

}