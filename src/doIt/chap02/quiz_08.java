package doIt.chap02;

import java.io.*;
import java.util.*;

public class quiz_08 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        br.close();

        Stack<Integer> st = new Stack<>();
        for (int i = n; i >= 1; i--) {
            st.push(i);
        }

        Stack<Integer> temp = new Stack<>();

        while (true) {
            while (st.size() > 1) {
                st.pop();
                if (st.size() == 1) {
                    System.out.println(st.peek());
                    return;
                }
                temp.push(st.pop());
            }

            while (temp.size() > 1) {
                st.push(temp.pop());
                if (temp.size() == 1) {
                    System.out.println(st.peek());
                    return;
                }
                temp.pop();
            }
        }

    }
}
