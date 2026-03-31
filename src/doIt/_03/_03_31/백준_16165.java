package doIt._03._03_31;

import java.io.*;
import java.util.*;

public class 백준_16165 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;

    static public void main(String args[]) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> team = new HashMap<>();
        Map<String, String> member = new HashMap<>();
        for(int group = 0; group <n; group++) {
            // 팀이름, 인원수, 멤버 이름
            String teamName = br.readLine();
            int teamCnt = Integer.parseInt(br.readLine());

            String[] arr = new String[teamCnt];
            for(int i =0; i<teamCnt; i++) {
                String memberName = br.readLine();
                arr[i] = memberName;
                member.put(memberName, teamName);
            }
            Arrays.sort(arr);

            sb = new StringBuilder();
            for(int i =0; i<teamCnt-1; i++) {
                sb.append(arr[i] + "\n");
            }
            sb.append(arr[teamCnt-1]);
            team.put(teamName, sb.toString()); // 팀 이름 - 사전 순 멤버 이름 리스트

        }

        // 팀 이름 혹은 멤버 이름 - 모두 고유함
        // 퀴즈 종류
        // 0 : 팀이름 (팀에 속한 멤버의 이름을 사전순으로 한 줄에 한 명씩 출력)
        // 1 : 멤버 이름 (해당 멤버가 속한 팀의 이름을 출력)
        for(int i =0; i<m; i++) {
            String name = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if(type==0) {
                System.out.println(team.get(name));
            } else {
                System.out.println(member.get(name));
            }
        }

    }

}