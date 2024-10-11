package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {

        // 1. 2차원 배열의 순회 : 이중 반복문으로 순회하면 된다!!

        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3"},
                {"C1"}
        } ;

        for (int i = 0; i < seats.length; i++) { // 세로 기준
            for (int j = 0; j < seats[i].length; j++) { // 가로 기준
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        /*
        A1 A2 A3 A4 A5
        B1 B2 B3
        C1
        */


        // 2. 이중 반복문으로 2차원 배열 만들기

        String[][] seats_2 = new String[3][5];
        String[] eng = {"A", "B", "C"};

        for (int i = 0; i < seats_2.length; i++) {
            for (int j = 0; j < seats_2[i].length; j++) {
                seats_2[i][j] = eng[i] + (j+1);
            }
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
