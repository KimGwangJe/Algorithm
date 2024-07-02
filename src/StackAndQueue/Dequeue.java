package StackAndQueue;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 디큐는 스택, 큐와 다르게 양쪽으로 값을 삽입과 삭제가 가능하다. List쓰는것보다는 나은듯
 * 어떤쪽으로 입력하고 출력하느냐에 따라 스택과 큐처럼 사용하는것도 가능하다.
 *
 * Dequeue의 메소드
 * 맨 앞에 값을 추가 - addFirst(), offerFirst(), push()
 * 맨 뒤에 값을 추가 - addLast(), add(), offerLast(), offer()
 * 용량 제한이 있는 덱일 경우 add를 사용할 경우 예외가 발생함 offer를 사용하면 성공시 true 실패시 false 반환
 *
 * 맨 앞의 값을 삭제 - remove(), removeFirst(), poll(), pollFirst(), element()
 * 맨 뒤의 값을 삭제 - removeLast(), pollLast(), pop()
 * remove를 사용할 경우 덱이 이어있다면 예외가 발생, poll을 사용할 경우 덱이 비어있다면 null이 리턴
 *
 * 값을 가져옴 - getFirst(), peekFirst(), getLast(), peekLast(), peek()
 * 값이 포함되어있는지 확인 - contains(Object o)
 *
 * 값을 앞에서부터 탐색하여 같은 값 삭제 - removeFirstOccurrence(Object o), remove(Object o)
 * 값을 뒤에서부터 탐색하여 같은 값 삭제 - removeLastOccurrence(Object o)
 *
 * 덱의 크기 - size()
*/

public class Dequeue {

    public static void main(String[] args){
        /**
         *  ArrayDeque, LinkedBlockingDeque, ConcurrentLinkedDeque, LinkedList 등을 사용
        */
        Deque<String> stack = new ArrayDeque<>();
        stack.addFirst("1");
        stack.add("2");
        stack.add("3");
        stack.push("4");

        for(String i: stack) System.out.println(i);

        stack.remove();
        stack.pop();
        for(String i: stack) System.out.println(i);

        System.out.println(stack.getFirst());
        System.out.println(stack.peek());
        System.out.println(stack.contains("1"));

        stack.add("7");
        stack.add("8");
        stack.removeFirstOccurrence("7");

        for(String i: stack) System.out.println(i);
    }
}
