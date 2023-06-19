package Programmers.level1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        long total = 0;

        for (int i = 1; i <= count; i++) {
            total = (long) price * i;
            answer += total;
        }

        answer -= money;

        if(answer < 0) {
            answer = 0;
        }

        return answer;
    }

    /**
     * public long solution(long price, long money, long count) {
     *         return Math.max(price * (count * (count + 1) / 2) - money, 0);
     *     }
     *     => 등차 수열 r(n(n+1)/2)
     */
}
