package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class 숫자짝궁 {

    // 다시 풀기
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (char c : X.toCharArray()) {
            xArr[c - 48]++; // 아스키 코드 48 -> 10진수 0

        }

        for (char c : Y.toCharArray()) {
            yArr[c - 48]++;
        }

        StringBuilder answer = new StringBuilder();


        for (int i=9; i>=0; i--) {
            if (xArr[i] > 0 && yArr[i] > 0) {
                answer.append(String.valueOf(i).repeat(Math.min(xArr[i], yArr[i])));
            }
        }
        return answer.toString().startsWith("0") ? "0" : answer.toString().equals("") ? "-1" : answer.toString();
    }

    public static void main(String[] args) {
        숫자짝궁 a = new 숫자짝궁();
        String solution = a.solution("100", "123450");
        System.out.println(solution);
    }
}
