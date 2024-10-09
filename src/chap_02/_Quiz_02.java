package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int distance = 121;

        String result = (distance >= 120) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 " + distance+ "cm 이므로 탑승 " + result);
    }
}
