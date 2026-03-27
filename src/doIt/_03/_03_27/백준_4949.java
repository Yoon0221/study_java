package doIt._03._03_27;

import java.io.*;
import java.util.*;

public class 백준_4949 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static boolean isBalance(String s) {

        Stack<Character> stack = new Stack<>();

        char sen[] = s.toCharArray();
        for(char c : sen) {
            if (c == '(') stack.push('(');
            if (c == '[') stack.push('[');

            if (c == ')') {
                if(stack.size() == 0) return false;
                if(stack.peek() == '(') stack.pop();
                else return false;
            }

            if (c == ']') {
                if(stack.size() == 0) return false;
                if(stack.peek() == '[') stack.pop();
                else return false;
            }
        }

        if(stack.size() == 0) return true;
        else return false;
    }

    static public void main(String args[]) throws IOException {

        while(true) {

            String now = br.readLine();
            if(now.equals(".")) break;

            if(isBalance(now)) sb.append("yes\n");
            else sb.append("no\n");

        }

        System.out.println(sb.toString());

    }

}