package Algorithm.String;

public class KMP {

    public static int kmpMatch(String t, String p){
        int pt = 1;
        int pp = 0;
        int[] skip = new int[p.length() + 1];

        // 해당 경우는 한개의 문자 일치로 어차피 비교할 수 있는 접두사와 접미사가 없기 때문에 본문의 포인터(Index 1 위치에 해당)는 냅둔 채
        // 패턴의 0번째 Index와 다시 비교해야하기 때문에 무조건 Skip[1] = 0이다. (즉, 1칸 이동)
        skip[pt] = 0;
        while(pt != p.length()){
            if(p.charAt(pt) == p.charAt(pp)){
                skip[++pt] = ++pp;
            } else if(pp == 0){
                skip[++pt] = pp;
            } else {
                pp = skip[pp];
            }
        }

        pt = pp = 0;
        while(pt != t.length() && pp != p.length()){
            if(t.charAt(pt) == p.charAt(pp)){
                pt++;
                pp++;
            } else if(pp == 0){
                pt++;
            } else {
                pp = skip[pp];
            }
        }

        if(pp == p.length()){
            return pt - pp;
        }
        return -1;
    }

    public static void main(String[] args){

    }
}
