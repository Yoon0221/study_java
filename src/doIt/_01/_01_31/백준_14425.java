package doIt._01._01_31;

import java.io.*;
import java.util.*;

public class 백준_14425 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i=0; i<n;i++) {
            set.add(br.readLine());
        }

        int ans = 0;
        for (int i=0; i<m;i++) {
            if (set.contains(br.readLine())) ans++;
        }

        System.out.println(ans);
    }
}