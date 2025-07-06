package doIt.chap02;

import java.io.*;
import java.util.*;

public class quiz_06 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();

        int[] nums = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int start = 0;
        int end = 0;
        for (int i = 0; i < p; i++) {
            if (arr[end] == 'A') nums[0]--;
            else if (arr[end] == 'C') nums[1]--;
            else if (arr[end] == 'G') nums[2]--;
            else nums[3]--;
            end++;
        }

        int cnt = 0;
        if (isMatch(nums))
            cnt++;

        while (end < s) {
            // end 는 삽입, start 는 삭제
            if (arr[end] == 'A') nums[0]--;
            else if (arr[end] == 'C') nums[1]--;
            else if (arr[end] == 'G') nums[2]--;
            else nums[3]--;
            end++;

            if (arr[start] == 'A') nums[0]++;
            else if (arr[start] == 'C') nums[1]++;
            else if (arr[start] == 'G') nums[2]++;
            else nums[3]++;
            start++;

            if (isMatch(nums))
                cnt++;
        }

        System.out.println(cnt);

    }

    // 매치 확인
    static boolean isMatch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                return false;
        }
        return true;
    }
}
