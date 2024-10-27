package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex11651 {
    static class Node implements Comparable<Node> {
        int x;
        int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o) {
            if(this.y < o.y){
                return -1;
            } else if(this.y > o.y){
                return 1;
            } else {
                if(this.x > o.x){
                    return 1;
                } else if(this.x < o.x){
                    return -1;
                } else{
                    return 0;
                }
            }
        }
    }

    public static ArrayList<Node> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Node(x,y));
        }

        Collections.sort(list);

        for(Node node : list){
            System.out.println(node.x + " " + node.y);
        }
    }
}
