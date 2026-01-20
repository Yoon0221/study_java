package doIt._01_20;

import java.io.*;
import java.util.*;

public class 백준_4949 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 각 문장 확인 함수
    static boolean isVPS(String s) {

        Stack<Character> stack = new Stack<>();

        char[] cList = s.toCharArray();
        for (char c : cList) {

            if (c == '(') {
                stack.push('(');
            } else if (c == '[') {
                stack.push('[');
            } else if (c == ')' || c == ']'){
                if(stack.isEmpty())
                    return false;

                if (c == ')') {
                    if (stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                } else {
                    if (stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                }
            }

        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    static public void main(String args[]) throws IOException {

         while (true) {
             String now = br.readLine();
             if (now.equals("."))
                 break;

             if(isVPS(now))
                 System.out.println("yes");
             else
                 System.out.println("no");
         }
    }
}