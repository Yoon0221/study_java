package doIt._01_29;

import java.io.*;
import java.util.*;

public class 백준_9375 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int test =0; test < t; test++) {

            int n = Integer.parseInt(br.readLine());
            int ans = 1;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i<n; i++) {

                st = new StringTokenizer(br.readLine());
                st.nextToken();

                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) +1);
            }

            for (Map.Entry<String, Integer> e : map.entrySet()) {
                int value = e.getValue() +1;
                ans *= value;
            }

            ans -= 1;
            sb.append(ans + "\n");
        }

        System.out.println(sb.toString());

    }
}