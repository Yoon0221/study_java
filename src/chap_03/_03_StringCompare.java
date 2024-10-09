package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 1. 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); // false -> s1과 s2가 같은지 비교
        System.out.println(s1.equals("JAVA")); // false -> s1과 JAVA가 같은지 비교. 대소문자도 구분함.
        System.out.println(s1.equalsIgnoreCase("JAVA")); // true -> s1과 JAVA가 같은지 비교. 대소문자는 구분하지 않음.

        // 2. equals 와 == 의 차이
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true -> 내용이 같아서 true
        System.out.println(s1 == s2); // true -> 참조가 같아서 true

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true -> 내용이 같아서 true
        System.out.println(s1 == s2); // false -> 참조가 같지 않아서 false
    }
}
