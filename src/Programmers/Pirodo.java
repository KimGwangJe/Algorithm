package Programmers;

public class Pirodo {
    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80,20}, {50,40}, {30,10}}));
    }

    public static boolean[] visited;
    public static int Rate = Integer.MIN_VALUE;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        DFS(dungeons, k, 0);

        return Rate;
    }

    public static void DFS(int[][] arr, int k, int depth){
        Rate = Math.max(Rate, depth);
        for(int i = 0; i < arr.length; i++){
            if(!visited[i] && k >= arr[i][0]){
                visited[i] = true;
                DFS(arr, k - arr[i][1], depth+1);
                visited[i] = false;
            }
        }
    }
}
