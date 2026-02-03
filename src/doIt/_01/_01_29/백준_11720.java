package doIt._01._01_29;

import java.io.*;

public class 백준_11720 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String now = br.readLine();
        for (int i =0; i<n; i++) {
            sum += now.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}