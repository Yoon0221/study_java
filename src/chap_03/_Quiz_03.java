package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        String num = "901231-1234567";
        System.out.println(num.substring(0,8));
        System.out.println(num.substring(0,(num.indexOf('-')+2)));
    }
}
