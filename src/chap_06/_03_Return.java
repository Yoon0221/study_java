package chap_06;

public class _03_Return {

    // static 다음에는 반환값에 맞는 함수 자료형을 선언해주어야 한다.
    // (여기서는 String 으로! 반환값이 없으면 void 사용!)
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static void main(String[] args) {

        // 반환값 : 함수에서 return 하는 값. 보통 반환값은 변수로 받아서 사용한다.
        String num = getPhoneNumber();
        System.out.println(num); // 02-1234-5678
    }
}
