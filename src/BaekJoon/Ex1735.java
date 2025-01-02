package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1735 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int parent = LCM(arr1[1], arr2[1]);

        int child = arr1[0] * (parent / arr1[1]) + arr2[0] * (parent / arr2[1]);

        int temp = GCD(parent, child);
        if(temp != 1){
            System.out.println(child/temp + " " + parent/temp);
        } else{
            System.out.println(child + " " + parent);
        }
    }

    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a % b);
    }

    public static int LCM(int a, int b){
        return (a*b) / GCD(a, b);
    }
}
