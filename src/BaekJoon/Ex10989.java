package BaekJoon;

import Algorithm.QueueAndStack.Priority;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Ex10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10001];
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        br.close();
        for(int i = 1; i < arr.length; i++){
            while(arr[i] > 0){
                bw.write(i+"\n");
                arr[i]--;
            }
        }
        bw.flush();
    }
}
