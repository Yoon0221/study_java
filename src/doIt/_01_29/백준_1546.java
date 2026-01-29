package doIt._01_29;

import java.io.*;
import java.util.*;

public class 백준_1546 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        double sum = 0;
        double max = Double.MIN_VALUE;
        for (int i = 0; i<n; i++) {
            int now = Integer.parseInt(st.nextToken());
            sum += now;
            max = Math.max(max, now);
        }

        System.out.println(sum/max*100/n);
    }
}