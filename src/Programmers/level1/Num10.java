package Programmers.level1;

public class Num10 {

    public int solution(String t, String p) {
        // p의 길이를 구한다.
        // t의 문자열 길이에서 p의 문자열 길이만큼 자른다.(반복문 사용, 한번 거쳐갈때마다 자리수 1증가
        // 자른 문자열이 p보다 작으면(정수형으로 캐스팅) 그 갯수를 리턴값으로 반환

        int idx = 0; // 자릿수
        int answer = 0;

        for (int i = 0; i < t.length(); i++) {
            if(p.length() + idx > t.length()) break;

            String num = t.substring(i, p.length() + idx);

            if(num.length() < p.length()) {
                break;
            }
            idx++;

            if(Long.parseLong(num) <= Long.parseLong(p)) { // int형으로는 담을 수 있는 정수 범위 초과하므로 Long으로 형변환
                answer++;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Num10 num = new Num10();
        int solution = num.solution("500220839878","7");
        System.out.println(solution);
    }
}
