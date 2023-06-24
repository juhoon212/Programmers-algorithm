package Programmers.level1;

public class 약수읙갯수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        int count = 0;

        for (int i = left; i <= right; i++) {

            int subCount = 0;

                for (int j = 1; j <= i; j++) {
                    if(i % j == 0)  {
                        subCount++;
                    }
            }

            if(subCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    /**
     * Math.sqrt() 사용 예
     *
     *  public int solution(int left, int right) {
     *         int answer = 0;
     *
     *         for (int i=left;i<=right;i++) {
     *             //제곱수인 경우 약수의 개수가 홀수
     *             if (i % Math.sqrt(i) == 0) {
     *                 answer -= i;
     *             }
     *             //제곱수가 아닌 경우 약수의 개수가 짝수
     *             else {
     *                 answer += i;
     *             }
     *         }
     *
     *         return answer;
     *     }
     */
}
