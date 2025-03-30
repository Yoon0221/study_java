package chap_06;

import java.util.*;
import java.io.*;

public class test {

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int answer = 0;
        int cnt = 0;
        for (int i = N.length()-1; i >= 0; i--) {

            int now = N.charAt(i)-'0';
            if (now >= 0 && now <= 9)
                now = now;
            else
                now -= 7;

            answer += (int)(Math.pow(b, cnt) * now);

            cnt++;
        }

        System.out.println(answer+1);
    }
}