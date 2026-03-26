package doIt._03._03_26;

import java.io.*;
import java.util.*;

public class 백준_1874 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        boolean canDo = true;

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        int now_add = 1;
        for(int i = 0; i <n; i++) {
            int now = Integer.parseInt(br.readLine());

            int top = stack.peek();

            // 불가능하면 바로 out
            if (now < top) {
                System.out.println("NO");
                canDo = false;
                break;
            }

            if (now > top) {
                // 같아질때까지 넣기
                for(int j = now_add; j <= now; j++) {
                    stack.add(j);
                    sb.append("+\n");
                }
                // now_add 갱신
                now_add = now+1;
            }

            if (now == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            }
        }

        if (canDo) System.out.println(sb.toString());

    }

}