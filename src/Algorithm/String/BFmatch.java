package Algorithm.String;

public class BFmatch {

    static int bfmatch(String s, String t){
        int pt = 0;
        int pp = 0;
        while(pt != s.length() && pp != t.length()){
            if(s.charAt(pt) == t.charAt(pp)){
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if(pp == t.length()){
            return pt - pp;
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "ABC이지스DEF";
        String t = "이지스";

        int idx = bfmatch(s, t);

        if(idx == -1){
            System.out.println("없음");
        } else{
            int len = 0;
            for(int i = 0; i < idx; i++){
                len += s.substring(i, i + 1).getBytes().length;
            }
            len += t.length();
            System.out.println((idx + 1) + "번째 문자부터 일치");
            System.out.println("텍스트 : " + s);
            System.out.printf(String.format("패 턴 : %%%ds\n", len), t);
        }
    }
}
