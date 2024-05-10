package SlidingWindow;

public class ex009 {
    static int[] checkArr = {1,0,0,1};
    static int[] myArr = {0,0,0,0};
    static int checkSecret = 0;
    static int result = 0;

    public static void main(String[] args){
        String[] A = {"G","A","T","A"};
        int s = 4;
        int p = 2;
        for (int k : checkArr) {
            if (k == 0) result++;
        }
        for(int i = 0; i < p; i++){
            add(A[i]);
        }
        if(checkSecret == 4) result++;
        for(int j = p; j < s; j++){
            int i = j - p;
            remove(A[i]);
            add(A[j]);
            if(checkSecret == 4) result++;
        }
        System.out.println(result);
    }

    public static void add(String a){
        switch (a){
            case "A":
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkSecret++;
                }
                break;
            case "C":
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                }
                break;
            case "G":
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                }
                break;
            case "T":
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                }
                break;
        }
    }

    public static void remove(String a){
        switch (a){
            case "A":
                myArr[0]--;
                checkSecret--;
                break;
            case "C":
                myArr[1]--;
                checkSecret--;
                break;
            case "G":
                myArr[2]--;
                checkSecret--;
                break;
            case "T":
                myArr[3]--;
                checkSecret--;
                break;
        }
    }
}
