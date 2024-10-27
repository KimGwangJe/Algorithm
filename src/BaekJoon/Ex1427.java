package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        String[] a = br.readLine().split("");

        ArrayList<Integer> arr = new ArrayList<>();
        for(String str: a){
            arr.add(Integer.parseInt(str));
        }

        arr.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
