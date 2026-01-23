package doIt._01_22;

import java.io.*;
import java.util.*;

public class 백준_2018 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int left = 1, right = 1, cnt = 0;
        int sum = 1;

        while(right <= n) {
            if (sum < n) {
                right++;
                sum += right;
            } else if (sum > n) {
                sum -= left;
                left++;
            } else {
                cnt++;
                right++;
                sum += right;
            }
        }

        System.out.println(cnt);
    }
}