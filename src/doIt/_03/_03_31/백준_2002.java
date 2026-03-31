package doIt._03._03_31;

import java.io.*;
import java.util.*;

public class 백준_2002 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> input = new HashMap<>();
        for(int i =0; i<n; i++) {
            String s = br.readLine();
            input.put(s, i+1);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i<n; i++) {
            String s = br.readLine();
            arr.add(input.get(s));
        }

        int cnt = 0;
        int min = Integer.MAX_VALUE;
        for(int i =n-1; i>=0; i--) {
            int now = arr.get(i);

            // 점점 최솟값이 되어야함
            if(now > min) cnt++;
            else min = now;
        }

        System.out.println(cnt);

    }

}