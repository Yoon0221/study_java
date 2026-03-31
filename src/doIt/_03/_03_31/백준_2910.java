package doIt._03._03_31;

import java.io.*;
import java.util.*;

public class 백준_2910 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static class Number {
        int num;
        int howMany;
        int order;

        Number(int num, int howMany, int order) {
            this.num = num;
            this.howMany = howMany;
            this.order = order;
        }
    }

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> howMany = new HashMap<>();
        Map<Integer, Integer> order = new HashMap<>();
        for(int i =0; i< n; i++) {
            int now = Integer.parseInt(st.nextToken());

            howMany.put(now, howMany.getOrDefault(now,0)+1); // 빈도
            if(!order.containsKey(now)) order.put(now, i+1);
        }

        ArrayList<Number> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : howMany.entrySet()) {
            int key = e.getKey();
            int count = e.getValue();
            int or = order.get(key);
            arr.add(new Number(key, count, or));
        }

        arr.sort((a,b) -> {
           if(a.howMany == b.howMany) {
               // 빈도순
               // 빈도 같으면 선착순
               return Integer.compare(a.order, b.order);
           }
           return Integer.compare(b.howMany, a.howMany);
        });

        for(Number i : arr) {
            for(int j = 0; j <i.howMany; j++)
                System.out.print(i.num + " ");
        }

    }

}