package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int distance;
    int next;

    public Node(int next, int distance){
        this.distance = distance;
        this.next = next;
    }

    @Override
    public int compareTo(Node o){
        if(this.distance != o.distance){
            return this.distance - o.distance;
        } else {
            return this.next - o.next;
        }
    }
}

public class Ex1753 {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken()); //정점
        int E = Integer.parseInt(st.nextToken()); //간선
        int start = Integer.parseInt(br.readLine()); //시작점

        ArrayList<ArrayList<Node>> list = new ArrayList<>();

        for(int i = 0; i < V+1; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            list.get(Integer.parseInt(st.nextToken())).add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        boolean[] visited = new boolean[V+1];
        int[] distance = new int[V+1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[start] = 0;

        for(int i = 0; i < V; i++){ //노드만큼만
            int nodeValue = Integer.MAX_VALUE;
            int nodeIdx = 0;
            for(int j = 1; j < V+1; j++){
                //처음에는 start 인덱스부터 시작
                // 가장 거리가 가까운 놈을 먼저 선택
                if(!visited[j] && distance[j] < nodeValue){
                    nodeValue = distance[j];
                    nodeIdx = j;
                }
            }
            visited[nodeIdx] = true;

            for(int j = 0; j < list.get(nodeIdx).size(); j++){
                Node adjNode = list.get(nodeIdx).get(j);
                if(distance[adjNode.next] > distance[nodeIdx] + adjNode.distance){
                    distance[adjNode.next] = distance[nodeIdx] + adjNode.distance;
                }
            }
        }

        for(int i = 1; i < V+1; i++){
            if(distance[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            } else{
                System.out.println(distance[i]);
            }
        }
    }
}
