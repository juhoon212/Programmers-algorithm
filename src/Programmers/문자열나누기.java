package Programmers;

public class 문자열나누기 {
    // 첫 글자와 같은 문자열이 다음에 나온 갯수가 첫 글자와 다른 문자열의 갯수가 같다면 멈추고 문자열 분리
    // 초기화를 기억하기!
    public int solution(String s) {
        int answer = 0;
        char prev = '1'; //b n
        int sameCount = 0;
        int diffCount = 0;


        for (char c : s.toCharArray()) {
            if(prev == '1') {
                prev = c;
                sameCount++;
                answer++;
            } else if(prev == c) {
                sameCount++;
            } else {
                diffCount++;
            }

            if(sameCount == diffCount) {
                prev = '1';
                sameCount = 0;
                diffCount = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열나누기 num = new 문자열나누기();
        int solution = num.solution("banana");
        System.out.println(solution);

    }
}
