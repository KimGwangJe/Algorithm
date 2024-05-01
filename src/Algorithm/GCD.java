package Algorithm;

public class GCD {

    //최소 공배수 구함
    public static int lcm(int x, int y){
        return (x*y) / gcd(x,y);
    }

    // 최대 공약수 구하는 유클리드 호제법
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        } else{
            return gcd(y,x%y);
        }
    }
    public static void main(String[] args){
        System.out.println(gcd(22,8));
    }
}
