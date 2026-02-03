package doIt._01._01_21;

import java.io.*;
import java.util.*;

public class 백준_10816 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<String, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String now = st.nextToken();
            map.put(now, map.getOrDefault(now, 0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            String now = st.nextToken();
            int ans = map.getOrDefault(now, 0);
            sb.append(ans+'0'-48);

            if (i == m-1)
            {
                System.out.println(sb.toString());
                break;
            }

            sb.append(" ");
        }
    }
}