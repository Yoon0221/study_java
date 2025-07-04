package doIt.chap02;

import java.io.*;

public class quiz_04 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] agrs) throws IOException {
        long n = Long.parseLong(br.readLine());

        long cnt = 0;
        long sum = 1, start = 1, end = 1;

        while (start <= n) {
            if (sum < n) {
                // end 를 이동
                end++;
                sum += end;
            } else if (sum > n) {
                // start 를 이동
                sum -= start;
                start++;
            } else {
                cnt++;
                // start 를 이동
                sum -= start;
                start++;
            }
        }

        System.out.println(cnt);
    }
}
