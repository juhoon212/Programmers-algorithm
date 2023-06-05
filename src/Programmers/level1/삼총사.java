package Programmers.level1;

public class 삼총사 {
    public int solution(int[] number) {

        // 다시 풀기

        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        삼총사 sam = new 삼총사();
        int solution = sam.solution(new int[]{-3, -2, -1, 0, 1, 2, 3});
        System.out.println(solution);
    }
}
