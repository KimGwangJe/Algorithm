package Search;

import java.util.Scanner;

public class Ex024DFS {
    public static String[] arr = {"2","3","5","7"};
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(String i: arr){
            DFS(i);
        }
    }

    public static void DFS(String P){
        if(!isPrime(P)){
            return;
        }
        if(P.length() == N){
            System.out.println(P);
        }
        for(int i = 0; i < 10; i++){
            DFS(P+Integer.toString(i));
        }
    }

    public static boolean isPrime(String n){
        int i = Integer.parseInt(n);
        for(int j = 2; j < i/2; j++){
            if(i%j == 0) return false;
        }
        return true;
    }
}