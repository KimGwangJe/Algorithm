package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4779 {
    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            sb = new StringBuilder();
            int len = (int) Math.pow(3, n);
            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            DFS(0, len);
            System.out.println(sb);

        }
    }

    public static void DFS(int start,int size) {
        if(size==1) {
            return;
        }
        int newSize=size/3;
        for(int i=start+newSize; i<start+2*newSize; i++) {
            sb.setCharAt(i, ' ');
        }

        DFS(start, newSize);
        DFS(start+2*newSize, newSize);
    }
}
