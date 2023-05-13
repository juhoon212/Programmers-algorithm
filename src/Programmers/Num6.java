package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Num6 {

    // 다시 풀기
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Set<String> set = new HashSet<>(Arrays.asList(keymap));
        set.remove("");

        for (int i = 0; i < targets.length; i++) { // targets

            for (int l = 0; l < targets[i].length(); l++) {
                int k = 101;

                for (String j : set) { // set
                    int index = j.indexOf(targets[i].charAt(l));

                    if (index == -1) continue;
                    else if (index < k) k = index; // k가 인덱스보다 크면 다음 배열에서 찾도록 필터역할
                }


                if (k == 101) {
                    answer[i] = -1;
                    break;
                } else answer[i] += (k + 1); // 2 ,
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Num6 num = new Num6();
        int[] solution = num.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
