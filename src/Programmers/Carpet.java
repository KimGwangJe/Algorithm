package Programmers;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int a = 1;
        boolean exit = true;
        while(exit){
            for(int i = 1; i <= a; i++){
                if(a * i == sum && yellow == (a - 2) * (i - 2)){
                    answer[0] = a;
                    answer[1] = i;
                    exit = false;
                }
            }
            a++;
        }

        return answer;
    }
}
