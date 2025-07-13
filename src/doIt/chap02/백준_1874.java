package doIt.chap02;

import java.io.*;
import java.util.*;

public class 백준_1874 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static public void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        int now_st = 0;
        st.push(now_st++);

        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            // 작으면 같아질때까지 넣어줌.
            while (st.peek() < now) {
                st.push(now_st++);
                sb.append("+\n");
            }

            // 크면 no
            if (st.peek() > now) {
                flag = false;
                break;
            };

            // 같으면 out
            if (st.peek() == now)
            {
                st.pop();
                sb.append("-\n");
            }
        }

        if (flag)
        {
            bw.write(sb.toString());
        } else {
            bw.write("NO");
        }

        bw.flush();
        br.close();
        bw.close();

    }

}
