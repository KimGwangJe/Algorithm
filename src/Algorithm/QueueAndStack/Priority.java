package Algorithm.QueueAndStack;

import java.util.Collections;
import java.util.PriorityQueue;

class Name implements Comparable<Name> {
    private int id;
    private String name;

    public Name(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Name other) {
        // id가 낮은 것에 우선순위를 둠
        if (this.id != other.id) {
            return this.id - other.id;
        }
        // id가 같다면 name을 기준으로 정렬 (String의 compareTo 사용)
        return this.name.compareTo(other.name);
    }
}

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Name> pq = new PriorityQueue<>();
        pq.add(new Name(360, "3"));
        pq.add(new Name(370, "4"));
        pq.add(new Name(1, "1"));
        pq.add(new Name(1, "2"));

        System.out.println("오름차순");
        while (!pq.isEmpty()) {
            Name name = pq.poll();
            System.out.println(name.getId() + " " + name.getName());
        }
        System.out.println("");
        PriorityQueue<Name> pqR = new PriorityQueue<>(Collections.reverseOrder());
        pqR.add(new Name(360, "3"));
        pqR.add(new Name(370, "4"));
        pqR.add(new Name(1, "1"));
        pqR.add(new Name(1, "2"));
        System.out.println("내림차순");
        while (!pqR.isEmpty()) {
            Name name = pqR.poll();
            System.out.println(name.getId() + " " + name.getName());
        }
    }
}
