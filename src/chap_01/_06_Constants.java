package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        String KR_COUNTRY_CODE = "+82"; // 국가 번호
        KR_COUNTRY_CODE = "+8282"; // 변경 가능

        final String REAL_KR_COUNTRY_CODE = "+82"; // 국가 번호
        // REAL_KR_COUNTRY_CODE = "+8282"; // 변경 불가능

        final double PI = 3.141592; // 원주율
        final String DATE_OF_BITHR = "01/01/1970"; // 생년월일
    }
}
