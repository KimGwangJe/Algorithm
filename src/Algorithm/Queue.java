package Algorithm;

public class Queue {

    int capacity = 10;
    int[] queue = new int[capacity];
    int front = 0;
    int num = 0;
    int rear = 0;

    public int inque(int data){
        if(num >= capacity) return -1;
        num++;
        queue[rear++] = data;
        if(rear == capacity) rear = 0;
        return data;
    }

    public int deque(){
        if(num <= 0) return -1;
        num--;
        int x = queue[front++];
        if(front == capacity) front = 0;
        return x;
    }

    public int peek(){
        if(num <= 0) return -1;
        return queue[front];
    }

    public void clear(){
        front = rear = num = 0;
    }

    public int indexOf(int data){
        if(num <= 0) return -1;
        for(int i = 0; i < num - 1; i++){
            if(queue[(front + i) % capacity] == data){
                return num+i;
            }
        }
        return -1;
    }

    // data가 front로부터 몇번째에 있는지
    public int search(int data){
        for(int i = 0; i < num; i++){
            if(queue[(front + i) % capacity] == data){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){

    }
}
