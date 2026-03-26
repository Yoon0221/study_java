package doIt._03._03_26;

import java.io.*;
import java.util.*;

public class 백준_11720 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        long sum = 0;
        String s = br.readLine();
        for(int i=0; i<n; i++) sum += s.charAt(i) - '0';

        System.out.println(sum);
    }

}