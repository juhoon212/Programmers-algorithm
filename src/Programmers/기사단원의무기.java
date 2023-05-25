package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 기사단원의무기 {

    // 시간복잡도 추가로 제곱근을 이용해서 풀기!!

    public int solution(int number, int limit, int power) {

        int numArray[] = new int[number + 1];
        int total = 0;
        for (int i = 1; i <= number; i++) {
            int divisor = countOfDivisor(i);
            numArray[i] = divisor > limit ? power : divisor;

            total += numArray[i];
        }
        return total;

    }

    private int countOfDivisor(int num) { // number까지의 약수의 갯수를 구하는 메소드
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

}
