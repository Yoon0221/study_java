package doIt._01_21;

import java.io.*;
import java.util.*;

public class 백준_1620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static Map<Integer, String> NumMap = new HashMap<>();
    static Map<String, Integer> NameMap = new HashMap<>();

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i<=n; i++) {
            String now = br.readLine();
            NumMap.put(i, now);
            NameMap.put(now, i);
        }

        for (int i = 0; i < m; i++) {
            String now = br.readLine();
            char[] cList = now.toCharArray();

            int check = cList[0] - '0';

            // 숫자만
            if (check >= 1 && check <= 9)
                System.out.println(NumMap.get(Integer.parseInt(now)));
            else
                System.out.println(NameMap.get(now));
        }
    }
}