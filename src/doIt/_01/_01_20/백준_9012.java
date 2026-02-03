package doIt._01._01_20;

import java.io.*;
import java.util.*;

public class 백준_9012 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int isVPS(String s) {

        char[] cList = s.toCharArray();
        Stack<String> stack = new Stack<>();
        for(char c : cList) {

            // 닫힘 등장 -> 열림 빼내기
            if (c == ')') {
                if (stack.isEmpty()) {
                    return -1;
                } else {
                    stack.pop();
                }
            }

            // 열림 등장 -> push
            if (c == '(') {
                stack.push("(");
            }
        }

        if (stack.size() != 0)
            return -1;
        else
            return 0;
    }

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String now = br.readLine();
            if (isVPS(now)==-1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }

}