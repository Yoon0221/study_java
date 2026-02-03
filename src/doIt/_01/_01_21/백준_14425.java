package doIt._01._01_21;

import java.io.*;
import java.util.*;

public class 백준_14425 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Set<String> Sset = new HashSet<>();
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i<n; i++) {
            Sset.add(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i<m; i++) {
           String now = br.readLine();
            if (Sset.contains(now)) cnt++;
        }

        System.out.println(cnt);
    }
}