package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;

        List<Integer> maxList = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();

        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            maxList.add(max);
            minList.add(min);
        }

        maxList.sort(Collections.reverseOrder());
        minList.sort(Collections.reverseOrder());
        answer += maxList.get(0) * minList.get(0);

        return answer;
    }

    /** 깔끔한 답안
     *  public int solution(int[][] sizes) {
     *         int length = 0, height = 0;
     *         for (int[] card : sizes) {
     *             length = Math.max(length, Math.max(card[0], card[1]));
     *             height = Math.max(height, Math.min(card[0], card[1]));
     *         }
     *         int answer = length * height;
     *         return answer;
     *     }
     */
}
