package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        // 문자열 변수 선언
        String name;

        // 변수에 값 대입
        name = "나도 코딩"; // 큰 따옴표

        // 변수 활용
        System.out.println(name + "님, 배송이 시작됩니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        // 변수 선언 & 값 대입
        String new_name = "나도 코딩";


        // 정수형 변수
        int hour = 15;

        // 정수형 변수 활용
        System.out.println(name + "님, " + hour + "시에 배송이 시작됩니다.");
        System.out.println(name + "님, " + hour + "시에 배송이 완료되었습니다.");


        // 다른 변수들
        double score = 90.5;
        char grade = 'A'; // 작은 따옴표
        name = "강백호"; // 변수의 값 바꾸기


        // 변수 활용
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");


        // 불리안 변수
        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? : " + pass);


        // double VS float : double이 더 크고 정밀 (float은 뒤에 f를 붙여야 함!)
        double d = 3.14;
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);

        // 단, float은 소수점 아래 6자리까지만 가능!
        d = 3.134567890;
        f = 3.134567890f;
        System.out.println(d);
        System.out.println(f);


        // int VS long : long이 더 크고 정밀 (Long은 뒤에 L를 붙여야 함!)
        // int i = 10000000000000; // 오류 -> int가 담기에 너무 큰 수! (int은 최대 21억까지)
        long l = 10000000000000L;
        System.out.println(l);

        // 0 3개 마다 언더바로 구분 가능! 프로그램이 인식하지 않음.
        long l2 = 10_000_000_000_000L;
        System.out.println(l2);

    }
}
