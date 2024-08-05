package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Ex1916 {
    static class Node1 implements Comparable<Node1>{
        int next;
        int data;

        public Node1(int next, int data){
            this.next = next;
            this.data = data;
        }

        public int compareTo(Node1 o){
            return data - o.data;
        }
    }

    public static ArrayList<ArrayList<Node1>> list = new ArrayList<>();
    public static boolean[] visited;
    public static int min = Integer.MAX_VALUE;
    public static int[] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int City = Integer.parseInt(br.readLine());
        for(int i = 0; i <= City; i++){
            list.add(new ArrayList<>());
        }
        visited = new boolean[City+1];
        dist = new int[City+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        int Bus = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < Bus; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            list.get(start).add(new Node1(end, distance));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int destination = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(start, destination));
    }

    public static int dijkstra(int start, int end){
        PriorityQueue<Node1> que = new PriorityQueue<>();
        que.offer(new Node1(start, 0));
        dist[start] = 0;
        while(!que.isEmpty()){
            Node1 node = que.poll();
            int now = node.next; //꺼낸 노드가 가리키는 다음 노드
            if(!visited[now]){ // 다음 노드에 방문한적이 있었나?
                visited[now] = true;
                for(Node1 n : list.get(now)){ //노드에서 출발해서 도착하는 도시만큼 반복
                    if(!visited[n.next] && dist[n.next] > dist[now] + n.data){
                        dist[n.next] = dist[now] + n.data;
                        que.add(new Node1(n.next, dist[n.next]));
                    }
                }
            }
        }
        return dist[end];
    }

}
