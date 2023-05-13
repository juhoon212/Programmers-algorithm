package Programmers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Num9 {
    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termsMap = new HashMap<>();
        int todayDate = getDate(today);
        List<Integer> answer = new ArrayList<>();

        for (String term : terms) {

            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]));
        }


        for (int i = 0; i < privacies.length; i++) {
            String[] prvSplit = privacies[i].split(" ");

            if(getDate(prvSplit[0]) + (termsMap.get(prvSplit[1]) * 28) <= todayDate) {
                answer.add(i+1);
            }
        }

            for (int i = 0; i < privacies.length; i++) {
                String[] prvSplit = privacies[i].split(" ");

                if(getDate(prvSplit[0]) + (termsMap.get(prvSplit[1]) * 28) <= todayDate) {
                    answer.add(i+1);
                }
            }

        return answer.stream().mapToInt(integer -> integer).toArray();
    }

    private int getDate(String today) {
        String[] date = today.split("\\.");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        return (month * 28) + day + (year * 12 * 28);
    }

    public static void main(String[] args) {
        Num9 num = new Num9();
        int[] solution = num.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
        for (int i : solution) {
            System.out.println(i);
        }

    }
}
