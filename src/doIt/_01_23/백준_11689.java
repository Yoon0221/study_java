package doIt._01_23;

import java.io.*;
import java.util.*;

public class 백준_11689 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        long phi = n;
        long temp = n;

        for (long i = 2; i * i <= temp; i++) {
            if (temp % i == 0) {
                while (temp % i == 0) temp /= i; // i로 나누어 모든 배수 제거
                phi -= phi / i;
            }
        }

        if (temp > 1) phi -= phi / temp; // 남은 소수 처리
        System.out.println(phi); // 결과 출력
    }
}