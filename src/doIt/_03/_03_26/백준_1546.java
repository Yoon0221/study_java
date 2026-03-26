package doIt._03._03_26;

import java.io.*;
import java.util.*;

public class 백준_1546 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int M = 0;
        double sum = 0;
        for(int i =0; i<n; i++) {
            int now = Integer.parseInt(st.nextToken());
            M = Math.max(M, now);
            sum += now;
        }

        System.out.println(sum/M*100/n);
    }

}