package Programmers.level1;

import java.util.*;

public class 명예의전당{

    // k일까지는 명예의 전당에 모두 올랃갈 수 있다.
    // k일이 지난 후에는 출연 가수의 점수가 k번째의 점수보다 높으면 교체
    // answer에 최하위 점수를 기록

    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>(); // 명예의 전당

        int idx = Math.min(k, score.length); //k가 score의 길이보다 더 크면 ArrayBoundException 발생하기 때문에 둘중에 큰 숫자를 사용


        for (int i = 0; i < idx; i++) {
            list.add(score[i]);
            answer[i] = Collections.min(list);
        }


        Collections.sort(list, Collections.reverseOrder());

        for (int i = k; i < score.length; i++) {
            if (list.get(k - 1) < score[i]) {
                list.remove(list.get(k - 1));
                list.add(score[i]);
                Collections.sort(list,Collections.reverseOrder());
                answer[i] = Collections.min(list);
            }

            answer[i] = Collections.min(list);


        }
        return answer;
    }

    public static void main(String[] args) {
        명예의전당 num = new 명예의전당();
        int[] solution = num.solution(9, new int[]{10, 30, 40, 3, 0, 20, 4});
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
