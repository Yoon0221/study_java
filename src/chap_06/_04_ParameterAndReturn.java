package chap_06;

public class _04_ParameterAndReturn {

    // 전달값과 반환값이 둘 다 있을 수도 있다!
    public static int getPowerExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int reVal = getPowerExp(3, 2);
        reVal = getPowerExp(reVal, 2);
        System.out.println(reVal); // 81
    }
}
