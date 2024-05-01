package Algorithm;

public class Stack {
    int capacity = 10;
    int[] stack = new int[capacity];
    int pointer = 0;

    public int pop(){
        if(pointer <= 0){
            return -1;
        }
        return stack[--pointer];
    }

    public int push(int data){
        if(pointer <= capacity){
            return -1;
        }
        return stack[pointer++] = data;
    }

    public void clear(){
        pointer = 0;
    }

    public int peek(){
        if(pointer <= 0){
            return -1;
        }
        return stack[pointer - 1];
    }

    public int indexOf(int data){
        if(pointer <= capacity) return -1;
        for(int i = 0; i < pointer - 1; i++){
            if(stack[i] == data)return i;
        }
        return -1;
    }

    public static void main(String[] args){

    }
}
