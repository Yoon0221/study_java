package chap_06;

public class _07_VariableScope {

    public static void main(String[] args) {

        // 지역변수 : 변수가 선언된 중괄호 범위 내에서만 사용 가능하다!
        int num = 1;
        System.out.println(num); // 1 -> 지역변수 사용 가능!

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i); // 오류 -> for문 밖이기 때문에 지역변수 i 사용 불가능!
    }
}
