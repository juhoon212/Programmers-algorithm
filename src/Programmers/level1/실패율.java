package Programmers.level1;

import java.util.*;

public class 실패율 {

    // 1 ~ N+1 까지의 스테이지
    // 한 스테이지 지날때마다 stages.length 에서 - 실패한 사람
    // 남은 사람 / 해당 스테이지 실패한 사람 수

    /*
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        int leftPeople = stages.length;

        Map<Integer, Float> map = new HashMap<>();

//        Arrays.sort(stages); // 1,2,2,2,3,3,4,6


        for (int i = 1; i < N + 1; i++) {
            int count = 0;
            leftPeople -= count;

            for (int j = 0; j < stages.length; j++) {
                if(stages[j] == i) {
                    count++;
                }
            }
            float failPercent = (float)leftPeople / count;
            map.put(i, failPercent);
        }

        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }

        return answer;
    }

     */

    public int[] solution(int N, int[] lastStages) {
        int nPlayers = lastStages.length;
        int[] nStagePlayers = new int[N + 2]; // length = 7
        for (int stage : lastStages) {
            nStagePlayers[stage] += 1;
        }

        int remainingPlayers = nPlayers;
        List<Stage> stages = new ArrayList<>();
        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];

            Stage s = new Stage(id, failure);
            stages.add(s);
        }
        Collections.sort(stages, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;

        public Stage(int id_, double failure_) {
            id = id_;
            failure = failure_;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure ) {
                return -1;
            }
            if (failure > o.failure ) {
                return 1;
            }
            return 0;
        }
    }



    public static void main(String[] args) {
        실패율 num = new 실패율();
        int[] solution = num.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        for (int i : solution) {
            System.out.print(i);
        }

    }
}
