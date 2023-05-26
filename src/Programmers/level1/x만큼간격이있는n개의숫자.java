package Programmers.level1;

public class x만큼간격이있는n개의숫자 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = x;
            total = total + x; // total에 x만큼 계속 더한다.(규칙:x만큼 늘어난다)
        }
        return answer;
    }
}
