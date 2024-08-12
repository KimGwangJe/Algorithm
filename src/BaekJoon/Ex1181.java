package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex1181 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(br.readLine());
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        int idx = 0;
        ArrayList<String> arr = new ArrayList<>();
        arr.add(list.get(0));
        bw.write(arr.get(idx) + "\n");
        for(int i = 0; i < N; i++){
            if(!arr.get(idx).equals(list.get(i))){
                arr.add(list.get(i));
                idx++;
                bw.write(arr.get(idx) + "\n");
            }
        }
        bw.flush();
    }
}
