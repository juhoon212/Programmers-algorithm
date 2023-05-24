package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 기사단원의무기 {

    // 시간복잡도 추가로 제곱근을 이용해서 풀기!!

    public static int solution(int number, int limit, int power) {

        int arr[] = new int[number + 1];
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int num = count(i);

            arr[i] = num > limit ? power : num;

            answer += arr[i];
        }

        for (int i : arr) {
            System.out.println(i);
        }
        return answer;

    }



    private static int count(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if(i * i == num) {
                count++;
            } else if(num % i == 0) {
                count += 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int solution = 기사단원의무기.solution(10, 3, 2);
        System.out.println(solution);
    }


}
