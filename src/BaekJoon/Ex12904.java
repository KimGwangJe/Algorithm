package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12904 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb1 = new StringBuffer();
        sb1.append(br.readLine());
        StringBuffer sb2 = new StringBuffer();
        sb2.append(br.readLine());

        while(sb2.length() != sb1.length()){
            if(sb2.charAt(sb2.length()-1) == 'B'){
                sb2.deleteCharAt(sb2.length()-1);
                sb2.reverse();
            } else{
                sb2.deleteCharAt(sb2.length()-1);
            }
        }
        System.out.println((sb2.compareTo(sb1) == 0) ? 1 : 0);

    }
}
