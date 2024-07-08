package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumberList {

    public static boolean myType(){
        String[] phone_book = {"119", "97674223", "1195524421","123"};
        Arrays.sort(phone_book);
        for(int i = 0; i<phone_book.length; i++){
            for(int j = i+1; j<phone_book.length; j++){
                if(phone_book[i].startsWith(phone_book[j])) return false;
                if(phone_book[j].startsWith(phone_book[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = true;
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                }
            }
        }
        System.out.println(answer);
        System.out.println(myType());
    }
}
