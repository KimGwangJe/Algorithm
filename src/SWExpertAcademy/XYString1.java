package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XYString1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test = 1; test <= T; test++) {
            String str = br.readLine();
            String temp = br.readLine();

            while(str.length() != temp.length()) {
                if(temp.charAt(temp.length() - 1) == 'Y') {
                    temp = reverse(temp.substring(0, temp.length() - 1));
                } else {
                    temp = temp.substring(0, temp.length() - 1);
                }
            }
            System.out.println(str.equals(temp) ? "#" + test+ " Yes" : "#" + test+ " No");
        }
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
