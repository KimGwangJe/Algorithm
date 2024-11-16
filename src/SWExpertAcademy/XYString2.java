package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XYString2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] result = new String[N];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            String content = br.readLine();
            while(true){
                if(str.equals(content)){
                    result[i] = "Yes";
                    break;
                } else {
                    int size =  content.length();
                    if(size != 1 && size > str.length()){
                        if(content.substring(size-2, size-1).equals("Y")){
                            content = content.substring(0, size-2) + "X";
                        } else{
                            content = content.substring(0, size-1);
                        }
                    } else {
                        result[i] = "No";
                        break;
                    }
                }
            }
        }
        for(String s : result){
            System.out.println(s);
        }

    }
}
