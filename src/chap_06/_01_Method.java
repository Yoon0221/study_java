package chap_06;

public class _01_Method {

    // 1. 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요. 메소드입니다!");
    }

    public static void main(String[] args) {

        // 메소드 : 기능을 수행하는 코드들의 묶음. 정의부와 호출부가 있다.

        // 2. 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");

        /*
        메소드 호출 전
        안녕하세요. 메소드입니다!
        안녕하세요. 메소드입니다!
        메소드 호출 후
        */
    }
}
