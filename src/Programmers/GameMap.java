package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        public int solution(int[][] maps) {
            int n = maps.length;
            int m = maps[0].length;
            boolean[][] visited = new boolean[n][m];
            Queue<int[]> queue = new LinkedList<>();

            queue.add(new int[]{0, 0, 1});
            visited[0][0] = true;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                int distance = current[2];

                if (x == n - 1 && y == m - 1) {
                    return distance;
                }

                for (int i = 0; i < 4; i++) {
                    int nextX = x + dx[i];
                    int nextY = y + dy[i];

                    if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        queue.add(new int[]{nextX, nextY, distance + 1});
                        visited[nextX][nextY] = true;
                    }
                }
            }

            return -1;
        }
}
