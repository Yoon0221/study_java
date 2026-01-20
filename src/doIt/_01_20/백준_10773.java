package doIt._01_20;

import java.io.*;
import java.util.*;

public class 백준_10773 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        long k = Integer.parseInt(br.readLine());

        Stack<Long> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            long now = Long.parseLong(br.readLine());

            if (now == 0)
            {
                stack.pop();
            } else {
                stack.push(now);
            }
        }

        long sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);

    }
}