package doIt.chap02;

import java.util.*;
import java.io.*;

public class quiz_08 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        int n = Integer.parseInt(br.readLine());
        br.close();

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack.push(i+1);
        }

        while (stack.size() > 2) {
            stack.removeLast();
            int temp = stack.removeLast();
            stack.push(temp);
        }

        System.out.println(stack.pop());
    }
}
