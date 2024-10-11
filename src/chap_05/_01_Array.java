package chap_05;

public class _01_Array {
    public static void main(String[] args) {

        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // 1. 배열 생성 방법 2가지

        // 1-1. 배열 선언 후 값 대입
        String[] coffees = new String[4];

        // 인덱스는 0부터 시작!!
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "카페라떼";
        coffees[3] = "카페모카";

        // 1-2. 배열 선언과 동시에 값 대입
        String[] my_coffess = {"아메리카노", "카페모카", "카페라떼", "카페모카"};


        // 2. 배열 값 읽기
        System.out.println(coffees[0]); // 아메리카노
        System.out.println(my_coffess[0]); // 아메리카노


        // 3. 배열의 값 변경하기
        coffees[0] = "라테";
        System.out.println(coffees[0]); // 라테
    }
}
