package doIt._01_23;

import java.io.*;
import java.util.*;

public class 백준_2470 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i< n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // 정렬
        Arrays.sort(arr);

        int left = 0;
        int right = n-1;
        Long now_min = Long.MAX_VALUE;
        long[] ans = new long[2];
        while (left < right) {

            long sum = arr[right] + arr[left];
            long abs_sum = Math.abs(sum);

            // 갱신
            if (now_min > abs_sum) {
                now_min = abs_sum;
                ans[0] = arr[left];
                ans[1] = arr[right];
            }

            if (sum > 0) { // 작아져야 함 -> right--
                right--;
            } else if (sum < 0) { // 커져야 함
                left++;
            } else break;
        }

        System.out.println(ans[0] + " " + ans[1]);
    }
}