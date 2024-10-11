package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        // do while : 조건과 상관없이 최소 1번은 실행된다!

        int distance = 25;
        int move = 0;
        int height = 25;

        do {
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);

        // 현재 이동 거리 : 0
    }
}
