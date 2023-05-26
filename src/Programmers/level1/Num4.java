package Programmers.level1;

public class Num4 {

    // 다시 풀기
    public static void main(String[] args) {
        Num4 n = new Num4();
        int[] solution = n.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        for (int i : solution) {
            System.out.println(i);
        }


    }


    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    minX = Math.min(minX,i); // 1
                    minY = Math.min(minY,j); // 5
                    maxX = Math.max(maxX,i); // 1
                    maxY = Math.max(maxY,j); // 5
                    // 계속 반복해서 비교
                }
            }
        }
        return new int[]{minX,minY,maxX+1,maxY+1};
    }
}
