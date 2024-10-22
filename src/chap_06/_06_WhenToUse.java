package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        return getPower(number, 2);
    }

    public static int getPower(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        // 메소드가 필요한 이유 : 코드의 중복을 줄여서 간결한 프로그램을 만들 수 있다!!
        // 꿀팁 : 메소드 내에서 다른 메소드를 호출하는 것도 좋은 방법이다!!

        System.out.println(getPower(10));           // 100
        System.out.println(getPower(10,2));   // 100
    }
}
