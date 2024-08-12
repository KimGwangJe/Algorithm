package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Member implements Comparable<Member>{
    int idx;
    int age;
    String name;

    Member(int idx, int age, String name){
        this.idx = idx;
        this.age = age;
        this.name = name;
    }
    public int compareTo(Member m){
        if(m.age != this.age){
            return this.age - m.age;
        } else {
            return this.idx - m.idx;
        }
    }

}
public class Ex10814 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Member> members = new ArrayList<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            members.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(members);
        for(int i = 0; i < members.size(); i++){
            bw.write(members.get(i).age + " " + members.get(i).name + "\n");
        }
        bw.flush();
    }
}
