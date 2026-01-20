package doIt._01_20;

import java.io.*;
import java.util.*;

public class 백준_1874 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main (String args[]) throws IOException {

        // push 는 반드시 오름차순
        // push 는 + pop 은 -
        // 불가능하면 NO

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        // for 문 시작
        int plus_num = 0;
        int check = 0;
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            // 넣을 수 있을만큼 넣기
            if (plus_num < now) {
                while(plus_num < now) {
                    plus_num += 1;
                    stack.add(plus_num);
                    sb.append("+\n");
                }
            }

            // 스택이 비어있거나 출력 불가 상태이면 NO
            if (stack.isEmpty()){
                System.out.println("NO");
                check = -1;
                break;
            } if (stack.peek() == now) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                check = -1;
                break;
            }

        }

        if (check == 0)
            System.out.println(sb.toString());
    }
}