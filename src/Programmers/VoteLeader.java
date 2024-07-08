package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * ✅ 문제
 * 학급 회장을 뽑는다. 후보로 기호 A, B, C, D, E 후보가 등록을 했다.
 * 투표 용지에는 학생들이 선택한 후보의 기호가 쓰여져 있다.
 * 개표는 선생님이 학생들 앞에서 발표를 하는 방식이다.
 * 누가 학급 회장이 되었는지를 구하는 문제이다.
 *
 * ✅ 입력
 * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어진다.
 * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력된다.
 *
 * ✅ 출력
 * 학급 회장으로 선택된 기호를 출력.
*/

public class VoteLeader {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        HashMap<String,Integer> map = new HashMap<>();
        for(String leader: arr){
            map.put(leader,map.getOrDefault(leader,0)+1);
        }
        int max = 0;
        String answer = "";
        for(String leader: map.keySet()){
            if(map.get(leader)>max) {
                max = map.get(leader);
                answer = leader;
            }
        }
        System.out.println(answer);
    }
}
