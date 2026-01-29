package doIt._01_29;

import java.io.*;
import java.util.*;

public class 백준_1874 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        // push 는 + : 반드시 오름차순
        // pop 은 -
        // 불가능하면 NO

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int top = 0;
        int check = 1;
        int num = 1;
        for(int i=0; i<n; i++) {
            int now = Integer.parseInt(br.readLine());

            top = stack.peek();
            // top 과 now 가 같음 -> -
            // top > now         -> no
            // top < now         -> + 같아질때까지

            if (top == now) {
                sb.append("-\n");
                stack.pop();
            } else if (top > now) {
                System.out.println("NO");
                check = 0;
                break;
            } else {
                while(num <= now) {
                    sb.append("+\n");
                    stack.push(num++);
                }
                sb.append("-\n");
                stack.pop();
            }
        }

        if (check==1) System.out.println(sb.toString());
    }

}