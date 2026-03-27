package doIt._03._03_27;

import java.io.*;
import java.util.*;

public class 백준_9375 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {

        int t = Integer.parseInt(br.readLine());
        for(int test = 0; test < t; test++) {

            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for(int i =0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type,0)+1);
            }
            // 계산 : 같은 종류는 1개만 -> 각 종류 + 1 (안 입음) 그리고 전체 -1
            long sum = 1;
            for(Map.Entry<String, Integer> e : map.entrySet()) {
                sum *= (e.getValue()+1);
            }
            sum -= 1;
            sb.append(sum + "\n");
        }

        System.out.println(sb.toString());

    }

}