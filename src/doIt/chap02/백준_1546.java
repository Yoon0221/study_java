package doIt.chap02;

import java.util.*;
import java.io.*;

public class 백준_1546 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main (String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        double sum = 0;
        double max = 0;
        for (int i = 0; i < n; i++) {
            double now = Integer.parseInt(st.nextToken());
            sum += now;
            if (max < now) max = now;
        }

        double new_avg = sum / n / max * 100;

        System.out.println(new_avg);

    }
}
