package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1967 {
    public static ArrayList<ArrayList<int[]>> list = new ArrayList<>();
    public static boolean[] visited;
    public static int maxDistance = 0;
    public static int farthestNode = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            list.get(from).add(new int[]{to, distance});
            list.get(to).add(new int[]{from, distance});
        }

        visited = new boolean[N + 1];
        DFS(1, 0);

        visited = new boolean[N + 1];
        maxDistance = 0;
        DFS(farthestNode, 0);

        System.out.println(maxDistance);
    }

    public static void DFS(int node, int distance) {
        visited[node] = true;

        if (distance > maxDistance) {
            maxDistance = distance;
            farthestNode = node;
        }

        for (int[] edge : list.get(node)) {
            if (!visited[edge[0]]) {
                DFS(edge[0], distance + edge[1]);
            }
        }
    }
}
