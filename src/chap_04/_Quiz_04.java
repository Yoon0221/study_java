package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        int car_type = 2; // 일반은 0, 경차는 1, 장애인 차량은 2
        int money = 4000;
        int time = 10;

        money *= time;
        if (money > 30000) {
            money = 30000;
        }

        switch (car_type) {
            case 0:
                break;
            case 1:
            case 2:
                money = (int) (money * 0.5);
                break;
        }

        System.out.println("주차 요금은 " + money + " 원입니다.");
    }
}
