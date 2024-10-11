package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {

        // 1. 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "에스프레소"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]);
        }

        /*
        아메리카노
        카페모카
        라떼
        에스프레소
        */


        // 2. 배열의 길이를 이용한 순회
        String[] coffees_2 = {"아메리카노", "카페모카", "라떼", "에스프레소"};

        for (int i = 0; i < coffees_2.length; i++) {
            System.out.println(coffees_2[i]);
        }

        /*
        아메리카노
        카페모카
        라떼
        에스프레소
        */


        // 3. enhanced for (for-each) 반복문
        String[] coffees_3 = {"아메리카노", "카페모카", "라떼", "에스프레소"};

        for (String coffee : coffees_3) {
            System.out.println(coffee);
        }

        /*
        아메리카노
        카페모카
        라떼
        에스프레소
        */

    }
}
