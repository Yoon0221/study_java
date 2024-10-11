package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {

        int grade = 2;
        int price = 7000;

        switch (grade) {
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                System.out.println("지급 : " + price);
                break;
            default :
                System.out.println("지급 대상이 아닙니다.");
        }

        // 지급 : 9000

    }
}
