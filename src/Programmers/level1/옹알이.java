package Programmers.level1;

public class 옹알이 {
    public int solution(String[] babbling) {

        // String class의 replace() 함수 생각해보기!!

        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye")
                    || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length() == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        옹알이 num = new 옹알이();
        int solution = num.solution(new String[]{"aya", "yee", "u", "maa"});
        System.out.println(solution);
    }
}
