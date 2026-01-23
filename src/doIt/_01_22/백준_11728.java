package doIt._01_22;

import java.io.*;
import java.util.*;

public class 백준_11728 {

    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static public void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] N = new int[n];
        for (int i =0; i <n; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] M = new int[m];
        for (int i =0; i <m; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }

        int[] NM = new int[n+m];

        int l = 0;
        int r = 0;
        for (int i=0; i<n+m; i++) {

            // 종료 조건
            if (l == n || r == m) {
                // 남은 배열 모두 넣기
                if (l==n) {
                    for (int j = r; j <m; j++) {
                        NM[i] = M[j];
                        i++;
                    }
                } else {
                    for (int j = l; j <n; j++) {
                        NM[i] = N[j];
                        i++;
                    }
                }
                break;
            }

            // 비교해서 작은 값부터 넣기
            if (N[l] > M[r])
            {
                NM[i] = M[r];
                r++;
            } else
            {
                NM[i] = N[l];
                l++;
            }
        }

        for (int i=0; i<n+m; i++) {
            sb.append(NM[i] + " ");
        }

        System.out.println(sb.toString());
    }
}