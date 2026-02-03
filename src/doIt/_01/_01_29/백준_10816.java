package doIt._01._01_29;

import java.io.*;
import java.util.*;

public class 백준_10816 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int now = Integer.parseInt(st.nextToken());
            map.put(now, map.getOrDefault(now,0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            int now = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(now,0)+" ");
        }

        System.out.println(sb.toString());
    }
}