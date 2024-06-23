package Algorithm.QueueAndStack;

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

    //여기에서 1이랑 -1을 변경하면 오름차순에서 내림차순으로 변경됨
    @Override
    public int compareTo(Name other){
        if(this.id > other.id){
            return 1;
        } else if(this.id < other.id){
            return -1;
        }
        return 0;
    }
}

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Name> pq = new PriorityQueue<>();
        pq.add(new Name(360,"3"));
        pq.add(new Name(370,"4"));
        pq.add(new Name(1,"1"));
        pq.add(new Name(10,"2"));

        while(!pq.isEmpty()){
            Name name = pq.poll();
            System.out.println(name.getId() + " " +name.getName());
        }
    }
}
