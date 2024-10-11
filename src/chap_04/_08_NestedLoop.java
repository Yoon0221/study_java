package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {

        // 이중 반복문
        for (int i = 0; i < 5; i++) {
            // 공백
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
             *
            **
           ***
          ****
         *****
        */
    }
}
