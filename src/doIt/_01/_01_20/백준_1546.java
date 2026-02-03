package doIt._01._01_20;

import java.io.*;

public class 백준_1546 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        String[] sList = br.readLine().split(" ");

        long m = Long.MIN_VALUE; // 순회하며 최댓값 검색
        long sum = 0;
        for(String s : sList) {
            int now = Integer.parseInt(s);
            if (now > m)
                m = now;

            sum += now;
        }

        System.out.println( sum*100.0 / (m*n) );

    }
}