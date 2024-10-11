package chap_04;

public class _11_Continue {
    public static void main(String[] args) {

        // continue : 현재 차례를 멈추고 다음 반복으로 넘어간다.

        int max = 5;
        int sold = 0;
        int noshow = 3;
        int index = 0;

        while (true) {

            index++;

            if (noshow == index) {
                continue;
            }

            System.out.println(index);

            sold++;

            if (sold == max) {
                System.out.println("재료 소진");
                break;
            }
        }

        /*
        1
        2
        4
        5
        6
        재료 소진
        */
    }
}
