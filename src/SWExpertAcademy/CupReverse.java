package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CupReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test = 1; test <= T; test++) {
            String s = br.readLine();
            String cup = s.split(" ")[0];
            int count = Integer.parseInt(s.split(" ")[1]);

            int idx = 0;
            for(int i = 0; i < cup.length(); i++) {
                if(cup.charAt(i) == 'o') {
                    idx = i;
                }
            }

            for(int i = 0; i < count; i++) {
                if(idx == 0) {
                    idx = 1;
                } else if(idx == 1) {
                    idx = 0;
                } else {
                    idx = 1;
                }
            }

            System.out.println("#" + test + " " + idx);
        }
    }
}
