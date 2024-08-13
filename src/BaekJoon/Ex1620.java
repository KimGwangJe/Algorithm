package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex1620 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> mapString = new HashMap<>();
        HashMap<Integer, String> mapInteger = new HashMap<>();

        for (int i = 1; i <= N; i++){
            String a = br.readLine();
            mapString.put(a, i);
            mapInteger.put(i, a);
        }

        for(int i = 0; i < M; i++){
            String s = br.readLine();
            try{
                int a = Integer.parseInt(s);
                bw.write(mapInteger.get(a) + "\n");
            } catch(NumberFormatException e){
                bw.write(mapString.get(s) + "\n");
            }
        }
        bw.flush();
    }
}
