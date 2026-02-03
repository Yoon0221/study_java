package doIt._01._01_22;

import java.io.*;
import java.util.*;

public class 백준_3273 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] N = new int[n];
        for (int i = 0; i < n; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }

        // sort
        Arrays.sort(N);

        int x = Integer.parseInt(br.readLine());

        int left = 0;
        int right = n-1;
        int cnt = 0;

        while (left < right) {
            int sum = N[left] + N[right];

            if (sum > x) { // 작아져야함
                right--;
            } else if (sum < x) { // 커져야함
                left++;
            } else {
                cnt++;
                // 가운데로 집합
                left++;
                right--;
            }
        }

        System.out.println(cnt);
    }
}