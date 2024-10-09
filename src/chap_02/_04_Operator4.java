package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {

        // 논리연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // or
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // and


        // System.out.println(1<3<5); // 오류
        System.out.println(1<3 && 3<5 && !(3==3)); // 정상


    }
}
