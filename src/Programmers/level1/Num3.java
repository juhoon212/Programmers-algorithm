package Programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Num3 {
    // 문제 다시 풀기

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        Map<Character, int[]> nav = new HashMap<>();
        nav.put('S', new int[]{1, 0});
        nav.put('N', new int[]{-1, 0});
        nav.put('W', new int[]{0, -1});
        nav.put('E', new int[]{0, 1});

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {

                if(park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j; // 초기위치 설정
                }
            }
        }

        for (String route:routes) {
            char direction = route.charAt(0); // 방향
            int distance = route.charAt(2) - '0';
            boolean flag = true;

            int stepX = answer[0]; // x축
            int stepY = answer[1]; // y축
            int[] dir = nav.get(direction); // value값으로 int배열 반환

            for (int i = 1; i <= distance; i++) {
                stepX += dir[0];
                stepY += dir[i];

                if(stepX >= park.length || stepX < 0 || stepY >= park[0].length() || stepY < 0
                        || park[stepX].charAt(stepY) == 'X') {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer[0] += dir[0] * distance;
                answer[1] += dir[1] * distance;
            }

        }

        return answer;
    }




}
