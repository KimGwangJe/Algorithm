package Algorithm;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        System.out.println(que.poll());
        System.out.println(que.peek()); //아무것도 없으면 null 반환
        que.offer(2);
        que.clear(); // 전체 삭제

        PriorityQueue<Integer> pq = new PriorityQueue<>(); //오름차순 정렬됨
        pq.offer(3);
        pq.offer(1);
        System.out.println(pq.poll()); // 우선순위가 높은 1이 먼저 나옴

        PriorityQueue<Integer> pq1 = new PriorityQueue<>((o1, o2) -> {
            //return o1 - o2; //오름차순
            return o2 - o1; //내림차순
        });
        pq1.offer(3);
        pq1.offer(1);
        System.out.println(pq1.poll()); // 우선순위 변경으로 3이 먼저 나옴
    }
}
