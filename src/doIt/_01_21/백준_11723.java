package doIt._01_21;

import java.io.*;
import java.util.*;

public class 백준_11723 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static Set<Integer> set = new HashSet<>();

    static void doOrder(String order, int num) {

        switch (order){
            case "add" -> {
                set.add(num);
            }
            case "remove" -> {
                if (set.contains(num)) set.remove(num);
            }
            case "check" -> {
                if (set.contains(num)) sb.append("1\n");
                else sb.append("0\n");
            }
            case "toggle" -> {
                if (set.contains(num)) set.remove(num);
                else set.add(num);
            }
            case "all" -> {
                for (int i = 1; i <= 20; i++) set.add(i);
            }
            // empty
            default -> {
                for (int i = 1; i <= 20; i++) {
                    if (set.contains(i)) set.remove(i);
                }
            }
        }

    }

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            int num = 0;
            if (!(order.equals("all") || order.equals("empty")))
                num = Integer.parseInt(st.nextToken());

            doOrder(order, num);
        }

        System.out.println(sb.toString());
    }
}