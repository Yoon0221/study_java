package doIt._02._02_16;

import java.io.*;
import java.util.*;

public class 백준_1759 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static List<String> path = new ArrayList<>();
    static void dfs(int start, int depth) {
        if(depth == L) {
            int cnt = 0;
            for(String s : path) {
                if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) cnt++;
            }
            if (cnt > 0 && L-cnt > 1) {
                for(String s : path) sb.append(s);
                sb.append("\n");
            }
        }

        for(int i = start; i <C; i++) {
            path.add(arr[i]);
            dfs(i+1, depth+1);
            path.remove(path.size()-1);
        }
    }

    static int L, C;
    static String[] arr;
    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = br.readLine().split(" ");
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb.toString());
    }
}