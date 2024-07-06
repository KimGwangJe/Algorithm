package Algorithm;

import java.util.List;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }

    public Node addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = this;
        return newNode;
    }

    public Node removeFirst(){
        return this.next;
    }

    public void add(int data){
        Node node = this;
        while(node.next!=null){
            node=node.next;
        }
        node.next=new Node(data);
    }

    public void get(){
        Node node=this;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}

public class LinkedList {
    public static void main(String[] args){
        Node head = new Node(1);
        head.add(2);
        head.add(3);
        head = head.addFirst(4);

        head.get();
        head = head.removeFirst();
        head.get();
    }
}
