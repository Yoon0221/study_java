package chap_03;

public class _01_String1 {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 1. 문자열의 길이
        System.out.println(s.length()); // 29

        // 2. 대소문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND PYTHON AND C.
        System.out.println(s.toLowerCase()); // i like java and python and c.

        // 3. 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false

        // 4. 위치 정보 (0부터 시작해서 시작위치를 반환한다.)
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1 -> 포함하지 않은 문자열은 -1이 반환
        System.out.println(s.lastIndexOf("and")); // 23 -> 마지막으로 나오는 위치 반환

        // 5. 시작 / 끝 정보
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith("java")); // false
    }
}
