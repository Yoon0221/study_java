package chap_04;

public class _10_Break {
    public static void main(String[] args) {

        // break : 반복문을 탈출한다.

        int max = 3;
        int index = 1;

        while (index < 5) {
            System.out.println(index);
            if (index == max) {
                System.out.println("재료 소진");
                break;
            }
            index++;
        }

        /*
        1
        2
        3
        재료 소진
        */
    }
}
