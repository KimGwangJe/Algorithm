package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Ex3584 {
    public static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(br.readLine());
            list = new ArrayList<>();
            for(int j = 0; j <= A; j++){
                list.add(new ArrayList<>());
            }
            int parent = 0;
            int child = 0;
            for(int j = 0; j < A; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                parent = Integer.parseInt(st.nextToken());
                child = Integer.parseInt(st.nextToken());
                if(j != A-1){
                    list.get(child).add(parent);
                }
            }
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(parent);
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(child);
            while(!list.get(parent).isEmpty()){
                   parent = list.get(parent).get(0);
                   list1.add(parent);
            }
            while(!list.get(child).isEmpty()){
                child = list.get(child).get(0);
                list2.add(child);
            }
            int size = Math.min(list1.size(), list2.size());
            for(int j = 0; j < size; j++){
                if(Objects.equals(list1.get(list1.size() - size + j), list2.get(list2.size() - size + j))){
                    System.out.println(list1.get(list1.size() - size + j));
                    break;
                }
            }
        }
    }
}
