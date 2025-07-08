package doIt.chap02;

import java.util.*;
import java.io.*;

public class quiz_07 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        st.push(0);

        int last = 1;
        int cnt = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            if (st.peek() > now)
                break;

            // 현재 수를 찾기. 못찾으면 push. top > now 가 되면 종료
            while (st.peek() < now) {
                st.push(last++);
                sb.append("+\n");
                cnt++;
            }

            if (st.peek() == now) {
                st.pop();
                sb.append("-\n");
                cnt++;
            }

        }

        if (cnt == 2*n) {
            System.out.println(sb.toString());
        } else System.out.println("NO");

    }
}
