package Programmers.level1;

import java.util.Arrays;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(!signs[i]) {
                absolutes[i] = absolutes[i] * -1;
            }

            answer += absolutes[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        음양더하기 num = new 음양더하기();
        int result = num.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
        System.out.println(result);

    }
}
