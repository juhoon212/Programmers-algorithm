package Programmers.level1;

import java.util.ArrayList;
import java.util.List;


public class Num8 {

    // 다시 풀기 char형의 알파벳이 어떤 숫자를 의미하는지 기억!

    List<Character> list = new ArrayList<>(); // a~z까지 담긴 LIST
    String answer = "";


    public String solution(String s, String skip, int index) {


        for (int i = 'a'; i <='z'; i++) {
            list.add((char) i);
        }

        for (int i = 0; i < s.length(); i++) {
            int loc = list.indexOf(s.charAt(i)); // list 에서 문자열s 하나하나의 위치
            String origin = list.get(loc + index).toString(); // 원래 위치에서 문자값 반환

            for (int j = 0; j < skip.length(); j++) {
                if(skip.charAt(j) == list.get(loc + i)){
                    index++;
                }
            }
            answer += list.get(loc + index).toString();


            }

        if(answer.contains("z")) {
            answer.replace("z", "a");
        }

        return answer;
    }

    public static void main(String[] args) {
        Num8 num = new Num8();
        String solution = num.solution(new String("aukks"), new String("wbqd"), 5);
        System.out.println(solution);

    }
}
