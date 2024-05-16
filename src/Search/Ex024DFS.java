package Search;

public class Ex024DFS {
    static int N = 4;
    public static void main(String[] args){
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    public static void DFS(int i, int jari){
        if(jari == N){
            if(isPrime(i)){
                System.out.println(i);
                return;
            }
        }
        for(int j = 1; j < 10; j++){
            if(j % 2 == 0) continue;
            if(isPrime(i*10+j)){
                DFS(i*10+j,jari+1);
            }
        }
    }

    public static boolean isPrime(int i){
        for(int j = 2; j <= i / 2; j++){
            if(i % j == 0) return false;
        }
        return true;
    }
}
