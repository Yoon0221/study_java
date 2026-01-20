package doIt._01_20;

import java.io.*;

public class 백준_11720 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        char[] sList = s.toCharArray();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int now = sList[i] - '0';
            sum += now;
        }

        System.out.println(sum);
    }

}