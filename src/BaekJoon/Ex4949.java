package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex4949 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;
            boolean isReal = true;
            Stack<Character> stack = new Stack<>();
            for(char c : str.toCharArray()){
                if(c == '('){
                    stack.push(c);
                } else if(c == '['){
                    stack.push(c);
                } else if(c == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        isReal = false;
                        break;
                    }
                } else if(c == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else {
                        isReal = false;
                        break;
                    }
                }
            }
            if(isReal && stack.isEmpty()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
