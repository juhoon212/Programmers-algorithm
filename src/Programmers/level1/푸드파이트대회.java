package Programmers.level1;

import java.util.*;

import static java.util.Collections.*;

public class 푸드파이트대회 {

    /**
     *
     * @param food
     * @return
     * food의 배열 각 원소0~1000
     */
    public String solution(int[] food) {
        String answer = "";
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < food.length ; i++) {
            if(!(food[i] % 2 == 0))
            food[i]--;

            count = food[i] / 2;

            for (int j = 0; j < count; j++) {
                list.add(i);

            }
         }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        answer += "0";

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }


//    public String solution2(int[] food) {
//        String answer = "0";
//
//        for (int i = food.length - 1; i > 0; i--) {
//            for (int j = 0; j < food[i] / 2; j++) {
//                answer = i + answer + i;
//            }
//        }
//
//        return answer;
//    }
    // 간단한 답안


}
