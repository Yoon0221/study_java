package chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 1. 문자열 변환
        System.out.println(s.replace("Java", "Python")); // I like Python and Python and C.

        // 2. 문자열 자르기
        System.out.println(s.substring(7)); // Java and Python and C. -> 인덱스 기준 7부터 출력
        System.out.println(s.substring(s.indexOf("Java"), s.lastIndexOf("and"))); // Java and Python -> 시작 위치는 포함하고 끝 위치는 포함하지 않는다.

        // 3. 공백 제거
        s = "    I like it     ";
        System.out.println(s); //     I like it
        System.out.println(s.trim()); // I like it -> 앞뒤 공백 제거

        // 4. 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + " and " + s2); // Java and Python
        System.out.println(s1.concat(" and ").concat(s2)); // Java and Python
    }
}
