package doIt._02._02_07;

import java.io.*;
import java.util.*;

public class 백준_14888 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;
    static char[] cal;
    static char[] c = {'+', '-', '×', '÷'};

    static boolean[] visited;
    static List<Character> path = new ArrayList<>();

    static int calculate(int first, int second, char c) {
        int ans = 0;
        switch(c) {
            case '+' -> ans = first + second;
            case '-' -> ans = first - second;
            case '×' -> ans = first * second;
            case '÷' -> ans = first / second;
        }
        return ans;
    }

    static long calculate() {
        Deque<Integer> DQ = new ArrayDeque<>();
        for (int i : arr) DQ.add(i);

        for(char c : path) {
            int first = DQ.pollFirst();
            int second = DQ.pollFirst();
            int result = calculate(first, second, c);
            DQ.addFirst(result);
        }

        return DQ.pollFirst();
    }

    static long min = Long.MAX_VALUE;
    static long max = Long.MIN_VALUE;
    static void dfs(int depth) {
        if (depth == n-1) {
            long now = calculate();
            min = Math.min(min, now);
            max = Math.max(max, now);
            return;
        }
        char c = ' ';
        for(int i=0; i<n-1; i++) {
            if(visited[i]) continue;
            if (c == cal[i]) continue;
            else c = cal[i];

            visited[i] = true;
            path.add(cal[i]);
            dfs(depth+1);
            path.remove(path.size()-1);
            visited[i] = false;
        }
    }

    static int[] arr;

    static public void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <n; i++) arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cal = new char[n-1];
        int cnt = 0;
        for(int i = 0; i <4; i++) {
            int now = Integer.parseInt(st.nextToken());
            for(int j = 0; j < now; j++) cal[cnt++] = c[i];
        }

        visited = new boolean[n];
        dfs(0);

        System.out.println(max);
        System.out.println(min);
    }
}