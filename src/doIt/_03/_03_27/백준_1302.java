package doIt._03._03_27;

import java.io.*;
import java.util.*;

public class 백준_1302 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i =0; i<n; i++) {
            String now = br.readLine();
            map.put(now, map.getOrDefault(now,0)+1);
        }

        String answer = "";
        int max = 0;
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            String key = e.getKey();
            int value = e.getValue();
            if(value > max) {
                max = value;
                answer = key;
            } else if (value == max) {
                // 사전순
                if(answer.compareTo(key) > 0) answer = key;
            }
        }

        System.out.println(answer);
    }

}