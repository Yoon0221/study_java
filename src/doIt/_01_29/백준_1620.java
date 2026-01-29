package doIt._01_29;

import java.io.*;
import java.util.*;

public class 백준_1620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (int i=1; i<=n;i++) {
            String now = br.readLine();
            map1.put(now, i);
            map2.put(i,now);
        }

        for (int i=0; i<m;i++) {
            String now = br.readLine();

            // 1 ~ 9사이면 숫자
            if (now.charAt(0)-'0' >= 1 && now.charAt(0)-'0' <= 9) {
                int num = Integer.parseInt(now);
                sb.append(map2.get(num) + "\n");
            } else {
                sb.append(map1.get(now) + "\n");
            }
        }

        System.out.println(sb.toString());

    }
}