package doIt._01._01_31;

import java.io.*;
import java.util.*;

public class 백준_11723 {

    static Set<Integer> s = new HashSet<>();
    static StringBuilder sb = new StringBuilder();

    static void changeSet(String name, int x) {
        switch(name) {
            case "add" -> s.add(x);
            case "remove" -> s.remove(x);
            case "check" -> {
                if (s.contains(x)) sb.append(1+"\n");
                else sb.append(0+"\n");
            }
            case "toggle" -> {
                if (s.contains(x)) s.remove(x);
                else s.add(x);
            }
            case "all" -> {
                for (int i=1; i<=20; i++) s.add(i);
            }
            case "empty" -> s.clear();
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i< n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int x = 0;
            if (!(name.equals("all") || name.equals("empty"))) x = Integer.parseInt(st.nextToken());

            changeSet(name, x);
        }

        System.out.println(sb.toString());
    }

}