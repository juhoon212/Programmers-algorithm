package Programmers.level1;

import java.util.Arrays;

public class Num2 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                // photo의 이차원 배열에 값이 있을때만
                if(Arrays.asList(name).indexOf(photo[i][j]) != -1) {
                    answer[i] += yearning[Arrays.asList(name).indexOf(photo[i][j])]; // 규칙 찾기
                }
            }
        }

        return answer;
    }
}
