package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num7 {

    // 조금만 더 간단하게 생각해보기

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int cards1Num = 0;
        int cards2Num = 0;

        String answer = "";

        for (int i = 0; i < goal.length; i++) {

            String cursor = goal[i];

            if(cards1Num < cards1.length && cursor.equals(cards1[cards1Num])) {
                cards1Num++;
            } else if (cards2Num < cards2.length && cursor.equals(cards2[cards2Num])) {
                cards2Num++;
            } else return "No";


        }

        return "Yes";
    }
}
