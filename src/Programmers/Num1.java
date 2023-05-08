package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Num1 {

    private Map<String, Integer> storage = new HashMap<>();
    private Map<Integer, String> newStorage = new HashMap<>();


    public String[] solution(String[] players, String[] callings) {

        for (int i = 0; i < players.length; i++) {
            storage.put(players[i], i + 1);
            newStorage.put(i + 1, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int curRank = storage.get(callings[i]); // 호출한 사람 등수
            int front = curRank - 1; // 앞 사람 등수
            String frontName = newStorage.get(front); //앞 사람 조회

            newStorage.put(front, callings[i]); // 호출당한 사람 앞으로
            newStorage.put(curRank, frontName); // 원래있던 사람 뒤로

            storage.put(frontName, curRank);
            storage.put(callings[i], front);
        }
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = newStorage.get(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Num1 n1 = new Num1();
        String[] solution = n1.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        for (String s : solution) {
            System.out.println(s);
        }
    }




}
