package doIt._01._01_29;

import java.io.*;
import java.util.*;

public class 백준_4949 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static Stack<String> stack;

    static public void main(String args[]) throws IOException {

        while(true) {
            String sentence = br.readLine();
            if (sentence.equals(".")) break;

            boolean isGood = true;
            stack = new Stack<>();
            stack.push("hi");
            for (int i=0; i<sentence.length(); i++) {

                String now = sentence.substring(i,i+1);

                // 4개 가능
                if (now.equals("(")) {
                    stack.push("(");
                } else if (now.equals(")")) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    }
                    else {
                        isGood = false;
                        break;
                    }
                } else if (now.equals("[")) {
                    stack.push("[");
                } else if (now.equals("]")) {
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    }
                    else {
                        isGood = false;
                        break;
                    }
                }

            }

            if (stack.size() != 1) isGood = false;

            if(isGood) sb.append("yes\n");
            else sb.append("no\n");
        }

        System.out.println(sb.toString());
    }
}