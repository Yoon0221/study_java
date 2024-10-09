package chap_01;

public class _04_Comment {
    public static void main(String[] args) {

        // 한 줄 주석 -> //
        System.out.println("(10분전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        // System.out.println("(5분전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        // 문장 중간부터 주석처리할 수도 있다.!
        int size = 120;
        size = size + 10; // 주석 : 문장에 대한 설명
        System.out.println("신발 사이즈 " + size + "으로 보여주세요");

        // 여러 줄 주석 -> /* */ ( ctrl + shift + / )
        /*int a = 10;
        int b = 20;
        System.out.println(a+b); // 30*/

    }
}
