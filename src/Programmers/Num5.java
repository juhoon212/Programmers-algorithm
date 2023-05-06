package Programmers;



public class Num5 {
    public int solution(int n, int m, int[] section) {

        // 간단하게 풀자 너무 어렵게 생각하지말자

        int answer = 0;
        int max = 0; // 6

        for (int element : section) {
            if(max <= element) {
                max = element + m;
                answer++;
            }
        }





        return answer;
    }
}
