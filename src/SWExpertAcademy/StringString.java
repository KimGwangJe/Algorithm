package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int test = 1; test <= N; test++){
            int length = Integer.parseInt(br.readLine());
            String str = br.readLine();
            if(length == 1 || length % 2 == 1){
                sb.append("#" + test + " No");
                sb.append("\n");
                continue;
            }
            boolean a = mirror(str);
            sb.append("#" + test);
            if(a){
                sb.append(" Yes");
            } else {
                sb.append(" No");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static boolean mirror(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()/2 + i)){
                return false;
            }
        }
        return true;
    }
}
