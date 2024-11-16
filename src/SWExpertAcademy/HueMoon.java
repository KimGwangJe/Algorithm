package SWExpertAcademy;

import java.util.Scanner;

public class HueMoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int test = 1; test <= T; test++) {
            String str = sc.nextLine();
            int length = str.length();

            boolean a = test(str.substring(0, length / 2));
            boolean b = test(str.substring(length/2+1, length));
            boolean c = test(str);

            System.out.println(a && b && c? "#" + test + " YES" : "#" + test + " NO");
        }
        sc.close();
    }

    public static boolean test(String str) {
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
