package doIt.chap02.yet;

import java.util.*;

public class 백준_2164 {

    // 괄호 문자열이 올바른지 확인하는 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("괄호 문자열을 입력하세요: ");
        String input = sc.nextLine();

        boolean result = isValidParentheses(input);
        if (result) {
            System.out.println("올바른 괄호입니다.");
        } else {
            System.out.println("올바르지 않은 괄호입니다.");
        }
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
