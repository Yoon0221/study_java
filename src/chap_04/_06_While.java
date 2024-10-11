package chap_04;

public class _06_While {
    public static void main(String[] args) {

        // while : 정확한 횟수가 정해져 있지 않을 때 사용!

        int distance = 15;
        int move = 0;

        while (move < distance) {
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착했습니다.");

        /*
        현재 이동 거리 : 0
        현재 이동 거리 : 3
        현재 이동 거리 : 6
        현재 이동 거리 : 9
        현재 이동 거리 : 12
        도착했습니다.
        */
    }
}
