package Programmers.level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 과일장수 {

    // 사과 한 상자의 가격 p * m
    // 다시풀기

    // 숫자가 배열로 주어지는 문제는 정렬을 생각해볼것

    public int solution(int k, int m, int[] scores) {

        Arrays.sort(scores);

        int answer = 0;

        for (int i = scores.length; i >= m ; i -= m) {
            answer += scores[i - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        과일장수 num = new 과일장수();
        int solution = num.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution);
    }
}
