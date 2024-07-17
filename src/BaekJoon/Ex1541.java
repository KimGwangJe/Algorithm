package BaekJoon;

import java.util.Scanner;

public class Ex1541 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] str = st.split("-");

        int sum = 0;
        for(int i = 0; i < str.length; i++){
            if(i == 0){
                sum += sum(str[i]);
            } else {
                sum -= sum(str[i]);
            }
        }
        System.out.println(sum);
    }
    public static int sum(String str){
        StringBuilder a = new StringBuilder();
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '+'){
                num+=Integer.parseInt(a.toString());
                a = new StringBuilder();
            } else {
                a.append(str.charAt(i));
            }
        }
        return num += Integer.parseInt(a.toString());
    }
}
