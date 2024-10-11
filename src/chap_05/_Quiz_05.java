package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        int[] sizes = new int[10];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = 250 + i*5;
        }
        for (int size : sizes) {
            System.out.println("사이지 " + size + " (재고 있음)");
        }
    }
}
