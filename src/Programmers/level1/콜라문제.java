package Programmers.level1;

public class 콜라문제 {
    // a = 마트에 가져다주는 빈 병의 갯수
    // b = a를 주었을때 마트에서 주는 콜라 병 수
    // n = 가지고 있는 병의 갯수
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n/a > 0) {
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라문제 num = new 콜라문제();
        int solution = num.solution(3, 1, 20);
        System.out.println(solution);
    }
}
