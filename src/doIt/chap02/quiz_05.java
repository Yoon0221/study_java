package doIt.chap02;

import java.io.*;
import java.util.*;

public class quiz_05 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long m = Long.parseLong(br.readLine());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        long cnt = 0;
        int start = 0, end = n-1;

        if (n > 1) {
            while(start < n && start < end) {

                long now = arr[start] + arr[end];

                if (now < m) {
                    // start 를 이동
                    start++;
                } else if (now > m) {
                    // end 를 이동
                    end--;
                } else {
                    cnt++;
                    start++;
                }
            }
        }

        System.out.println(cnt);

    }
}
