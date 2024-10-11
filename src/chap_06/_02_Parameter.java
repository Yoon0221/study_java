package chap_06;

public class _02_Parameter {

    // 1. 전달값이 있는 메소드 정의 (정의부에 넣어주는 값을 "파라미터(매개변수)"라고 부른다.)
    public static void power (int number) {
        int result = number * number;
        System.out.println(result);
    }

    public static void main(String[] args) {

        // 2. 전달값이 있는 메소드 호출 (호출부에 넣어주는 값을 "인수"라고 부른다.)
        power(2); // 4
        power(3); // 9
    }
}

// 여기부터 - 전달값 (5분 39초부터)