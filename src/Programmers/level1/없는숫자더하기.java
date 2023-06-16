package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {

        int answer = 0;
        int total = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        int result = total - answer;

        return result;
    }

    public static void main(String[] args) {
        없는숫자더하기 num = new 없는숫자더하기();
        int solution = num.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        System.out.println(solution);
    }

    /**
     * 다른 답안
     * public int solution(int[] numbers) {
     *         int answer = 0;
     *         int[] sum = {0,1,2,3,4,5,6,7,8,9};
     *
     *         for(int i = 0; i< sum.length; i++){
     *             for(int j=0; j< numbers.length; j++){
     *                 if(sum[i] == numbers[j]){
     *                     sum[i] -= numbers[j];
     *                 }
     *             }
     *             answer += sum[i];
     *         }
     *         return answer;
     *     }
     */
}

