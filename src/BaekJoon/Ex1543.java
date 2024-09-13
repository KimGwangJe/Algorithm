package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Ex1543 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        String[] a = br.readLine().split("");

        int i = 0;
        int num = 0;
        boolean flag = true;
        while(i <= str.length - a.length){
            for(int j = 0; j < a.length; j++){
                if(!Objects.equals(str[i + j], a[j])){
                    flag = false;
                    break;
                }
            }
            if(flag){
                num++;
                i+=a.length;
            } else {
                i++;
                flag = true;
            }
        }
        System.out.println(num);
    }
}
