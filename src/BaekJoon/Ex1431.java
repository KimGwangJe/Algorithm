package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Serial implements Comparable<Serial>{
    String name;

    Serial(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Serial o) {
        String[] str = this.name.split("");
        int strNum = 0;
        String[] str1 = o.name.split("");
        int str1Num = 0;
        for(int i = 0; i < this.name.length(); i++){
            try{
                strNum+=Integer.parseInt(str[i]);
            } catch(NumberFormatException e){}
        }
        for(int i = 0; i < o.name.length(); i++){
            try{
                str1Num+=Integer.parseInt(str1[i]);
            } catch(NumberFormatException e){}
        }
        if(this.name.length() != o.name.length()){
            return this.name.length() - o.name.length();
        } else if(strNum != str1Num){
            return strNum - str1Num;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}

public class Ex1431 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Serial> serial = new ArrayList<>();
        for(int i = 0; i < N; i++){
            serial.add(new Serial(br.readLine()));
        }
        Collections.sort(serial);
        for(Serial i : serial){
            System.out.println(i.name);
        }
    }
}
