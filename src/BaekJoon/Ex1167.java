package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Tree{
    int to;
    int distance;

    Tree(int to, int distance){
        this.to = to;
        this.distance = distance;
    }
}
public class Ex1167 {

    public static ArrayList<ArrayList<Tree>> list = new ArrayList<>();
    public static int Max = Integer.MIN_VALUE;
    public static int maxNode = 0;
    public static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 1; i <= N; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int idx = 1;
            while(idx != str.length - 1){
                int left = Integer.parseInt(str[idx]);
                int right = Integer.parseInt(str[idx + 1]);
                list.get(a).add(new Tree(left, right));
                idx += 2;
            }
        }
        visited = new boolean[N + 1];
        BFS(1);

        visited = new boolean[N + 1];
        Max = Integer.MIN_VALUE;
        BFS(maxNode);

        System.out.println(Max);
    }

    public static void BFS(int start) {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(new Tree(start, 0));  // 시작 노드와 거리를 큐에 넣음
        visited[start] = true;

        while (!queue.isEmpty()) {
            Tree current = queue.poll();
            int node = current.to;
            int distance = current.distance;

            // 거리가 최대일 때 maxNode와 Max를 업데이트
            if (distance > Max) {
                Max = distance;
                maxNode = node;
            }

            // 현재 노드에서 연결된 노드들을 큐에 추가
            for (Tree next : list.get(node)) {
                if (!visited[next.to]) {
                    visited[next.to] = true;
                    queue.add(new Tree(next.to, distance + next.distance));
                }
            }
        }
    }

}
