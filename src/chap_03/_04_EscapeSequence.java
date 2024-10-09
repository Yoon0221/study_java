package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {

        // 특수문자 (이스케이프 문자)

        // 1. \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");
        /*
        자바가
        너무
        재밌어요
        */

        // 2. \t : tap 효과
        System.out.println("해물파전\t9000원"); // 해물파전	9000원
        System.out.println("파전\t7000원"); // 파전	7000원

        // 3. \\ : \
        System.out.println("C:\\Program Files\\(x86)"); // C:\Program Files\(x86)

        // 4. \" : "
        System.out.println("단비가 \"냐용\"이라고 했어요"); // 단비가 "냐용"이라고 했어요

        // 5. \' : '
        System.out.println("단비가 \'냐용\'이라고 했어요"); // 단비가 '냐용'이라고 했어요
        char c = '\'';
        System.out.println(c); // '

    }
}
