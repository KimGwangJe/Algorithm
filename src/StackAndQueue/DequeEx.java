package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class DequeEx {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String command = st.nextToken();

            if (command.equals("pop")) {
                if (!deque.isEmpty()) {
                    deque.pop();
                } else {
                    System.out.println("-1");
                }
            } else if (command.equals("size")) {
                System.out.println(deque.size());
            } else if (command.equals("empty")) {
                System.out.println(deque.isEmpty() ? "1" : "0");
            } else if (command.equals("front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.getFirst());
                } else {
                    System.out.println("-1");
                }
            } else if (command.equals("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.getLast());
                } else {
                    System.out.println("-1");
                }
            } else { // assume command is "push"
                int a = Integer.parseInt(st.nextToken());
                deque.add(a);
            }
        }
    }
}
