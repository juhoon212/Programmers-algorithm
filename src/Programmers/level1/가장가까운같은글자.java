package Programmers.level1;

public class 가장가까운같은글자 {

    // 다시 풀기
    public int[] solution(String s) {
        //  알파벳이 처음 나오면 -1 반환
        // 알파벳의 앞에 같은 알파벳이 있으면 그 글자기준으로 몇번쨰 앞에 있는지 index 반환
        // 앞에 같은 글자가 있다면 가까운 곳의 index를 세서 반환

        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            String subStr = s.substring(0, i);
            if(subStr.indexOf(s.charAt(i)) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - subStr.lastIndexOf(s.charAt(i));
            }
        }

        return answer;
    }



}
