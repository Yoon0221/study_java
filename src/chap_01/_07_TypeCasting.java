package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d =93.3;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 93

        // 정수 + 실수 연산
        score = 93 + (int)98.8;
        System.out.println(score); // 93 + 98

        // 큰 곳에 작은 값을 넣는 상황 (ex. double 에 int를 넣는 상황)에서는 자동으로 형변환이 된다.
        // int -> long -> float -> double
        score_d = (double)93 + 98.8;
        System.out.println(score_d); // 93.0 + 98.8
        score_d = 93 + 98.8;
        System.out.println(score_d); // 93.0 + 98.8


        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1); // 93

        s1 = Integer.toString(93);
        System.out.println(s1); // 93


        // 실수를 문자열로
        String s2 = String.valueOf(98.8);
        System.out.println(s2); // 98.8

        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8


        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("93.3");
        System.out.println(d); // 93.3
    }
}
