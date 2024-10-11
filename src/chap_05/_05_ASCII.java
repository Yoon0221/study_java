package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {

        // 1. 아스키 코드 : 미국 표준 코드

        // 알파벳 대문자(A)는 65부터 시작
        // 알파벳 소문자(a)는 97부터 시작
        // 숫자(0)는 48부터 시작

        char c = 'A';
        System.out.println(c); // A -> 원래 문자
        System.out.println((int)c); // 65 -> 아스키 코드 상의 위치
        System.out.println((int)++c); // 66 -> 아스키 코드를 활용하여 연산이 가능!!


        // 2. 아스키 코드를 활용해서 2차원 배열 만들기

        String[][] seats_2 = new String[3][5];
        char eng = 'A';

        for (int i = 0; i < seats_2.length; i++) {
            for (int j = 0; j < seats_2[i].length; j++) {
                seats_2[i][j] = String.valueOf(eng) + (j+1);
            }
            eng++;
        }

        for (int i = 0; i < seats_2.length; i++) {
            for (int j = 0; j < seats_2[i].length; j++) {
                System.out.print(seats_2[i][j] + " ");
            }
            System.out.println();
        }

        /*
        A1 A2 A3 A4 A5
        B1 B2 B3 B4 B5
        C1 C2 C3 C4 C5
        */
    }
}
