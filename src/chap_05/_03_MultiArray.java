package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {

        // 2차원 배열 : 1차원 배열 여러 개를 저장하는 배열

        // 1. 2차원 배열 생성 방법 2가지

        // 1-1. 배열 선언 후 값 대입
        String[][] seats_1 = new String[3][5];

        // 인덱스는 0부터 시작!!
        seats_1[0][0] = "A1";
        seats_1[0][1] = "A2";
        seats_1[0][2] = "A3";
        seats_1[0][3] = "A4";


        // 1-2. 배열 선언과 동시에 값 대입
        String[][] seats_2 = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3"},
                {"C1"}
        } ;


        // 2. 2차원 배열 값 읽기
        System.out.println(seats_1[0][0]); // A1
        System.out.println(seats_2[0][0]); // A1


        // 3. 2차원 배열의 값 변경하기
        seats_1[0][0] = "라테";
        System.out.println(seats_1[0][0]); // 라테

    }
}
