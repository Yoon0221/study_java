package chap_06;

public class _05_Overloading {

    public static int getPowerExp(int number) {
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPowerExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPowerExp(String strNumer, int exponent) {
        int number = Integer.parseInt(strNumer);
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        // 메소드 오버로딩 : 비슷한 기능을 가진 메소드들의 이름을 같게 한다!
        //                 단, 전달값이 적어도 하나는 달라야 한다!! (타입 or 갯수)

        System.out.println(getPowerExp(5));                // 25
        System.out.println(getPowerExp(5, 2));     // 25
        System.out.println(getPowerExp("5", 2));  // 25
    }
}
