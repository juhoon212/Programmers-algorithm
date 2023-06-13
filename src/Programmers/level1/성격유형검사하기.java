package Programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    // choice.length = 7

    // survey 로 주어진 배열안 요소 문자열 두개 중 1~3번을 선택하면 첫번째
    // 4번 선택은 아무것도 선택하지 않음 그리고 정렬 내림차순 순으로 빠른 요소 선택
    // 5~7 번은 두번쨰 요소 선택
    public String solution(String[] survey, int[] choices) {

        // 다시 풀기
        String answer = "";
        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> point = new HashMap<Character, Integer>();

        // 점수 기록할 배열 초기화
        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        // 점수 기록
        for (int idx = 0; idx < choices.length; idx++){
            if(choices[idx] > 4){
                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
            } else {
                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
            }
        }

        // 지표 별 점수 비교 후 유형 기입
        for (char[] t : type) {
            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
        }

        return answer;
    }
    public static void main(String[] args) {
        성격유형검사하기 num = new 성격유형검사하기();
        String solution = num.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        System.out.println(solution);

    }

}
