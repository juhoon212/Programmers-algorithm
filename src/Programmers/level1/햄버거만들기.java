package Programmers.level1;

import java.util.Stack;

public class 햄버거만들기 {

    // 다시 풀기 // 스택 개념 공부!!

    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            System.out.println("i = " + i);
            stack[sp++] = i; //[2, 1]
            System.out.println("sp = " + sp);
            for (int i1 : stack) {
                System.out.println("stack = " + i1);
            }
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
            System.out.println("answer = " + answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        햄버거만들기 num = new 햄버거만들기();
        int solution = num.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution);
    }




}
