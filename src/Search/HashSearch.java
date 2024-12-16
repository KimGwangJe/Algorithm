package Search;

import java.util.HashMap;

public class HashSearch {
    public static String[][] arr = {{"Alice", "25"},{"Bob","30"},{"Cathy","35"},{"David","40"}};
    public static void main(String[] args){
        HashMap<Object, Object> map = new HashMap<>();
        for (String[] strings : arr) {
            map.put(strings[0], strings[1]);
        }
        String target = "Cathy";
        if(map.containsKey(target)){
            System.out.println("Target Age = " + map.get(target));
        } else{
            System.out.println("Target " + target + " not found");
        }
    }
}
