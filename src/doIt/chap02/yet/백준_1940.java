package doIt.chap02.yet;

import java.util.Scanner;

public class 백준_1940 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String msg = sc.next();
        sc.close();

        char[] ch = msg.toCharArray();

        long sum = 0;
        for (int i = 0; i < ch.length; i++) {
            int now = ch[i] - '0';
            sum += now;
        }

        System.out.println(sum);

    }
}