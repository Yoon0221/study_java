package doIt._01_21;

import java.io.*;
import java.util.*;

public class 백준_9375 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int cntHowMany(Map<String,Integer> map) {
        int sum = 1;
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            int value = e.getValue();
            sum *= (value+1);
        }
        return sum-1;
    }

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            int m = Integer.parseInt(br.readLine());
            Map<String,Integer> map = new HashMap<>();

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                map.put(type, map.getOrDefault(type,0)+1);
            }

            sb.append(cntHowMany(map) + "\n");
        }

        System.out.println(sb.toString());
    }
}