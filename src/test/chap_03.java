package test;

// 1부터 100000 사이의 모든 소수를 출력하라.
public class chap_03 {

    public static void main(String[] args) {

        System.out.println("소수 목록: ");
        for (int i = 2; i <= 100000; i++) {
            if( isPrime(i) ) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
