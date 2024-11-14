package Programmers;

import java.util.ArrayList;

public class MoumDictionary {
    public static void main(String[] args){
        System.out.println(solution("AAAAE"));
        System.out.println(solution("EIO"));
    }

    public static String[] str = {"A","E","I","O","U"};
    public static ArrayList<String> list = new ArrayList<>();

    public static int solution(String word) {
        DFS("");
        return list.indexOf(word)+1;
    }

    public static void DFS(String s){
        if(s.length() == 5) {
            return;
        }
        for(int i = 0; i < str.length; i++){
            list.add(s+str[i]);
            DFS(s+str[i]);
        }
    }
}
