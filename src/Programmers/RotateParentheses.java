package Programmers;

import java.util.Stack;

public class RotateParentheses {
        public int solution(String s) {
            int answer = 0;
            for(int i = 0; i < s.length(); i++){
                Stack<Character> stack = new Stack<>();
                String str = s.substring(i,s.length()) + s.substring(0,i);
                for(int j = 0; j < str.length(); j++){
                    char a = str.charAt(j);
                    if(stack.isEmpty()){
                        stack.push(a);
                    } else if(a == ')' && stack.peek() == '('){
                        stack.pop();
                    } else if(a == '}' && stack.peek() == '{'){
                        stack.pop();
                    } else if(a == ']' && stack.peek() == '['){
                        stack.pop();
                    } else {
                        stack.push(a);
                    }
                }
                if(stack.isEmpty()) answer++;
            }
            return answer;
        }
}
