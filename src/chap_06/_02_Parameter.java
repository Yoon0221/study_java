package chap_06;

public class _02_Parameter {

    // 1. 전달값이 있는 메소드 정의 (정의부에 넣어주는 값을 "파라미터(매개변수)"라고 부른다.)
    public static void power (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        // 2. 전달값이 있는 메소드 호출 (호출부에 넣어주는 값을 "인수"라고 부른다.)
        power(2, 3); // 8
        power(3, 3); // 27
        power(10, 0); // 1
    }
}