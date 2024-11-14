package Programmers;

public class PaperJubgi {
    public static void main(String[] args){
        System.out.println(solution(new int[]{30,15}, new int[]{26,17}));
        System.out.println(solution(new int[]{50,50}, new int[]{100,241}));
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true){
            int billA = bill[0];
            int billB = bill[1];
            int walletA = wallet[0];
            int walletB = wallet[1];

            int BMin = Math.min(billA, billB);
            int WMin = Math.min(walletA, walletB);
            int BMax = Math.max(billA, billB);
            int WMax = Math.max(walletA, walletB);
            if(BMin > WMin || BMax > WMax){
                if(BMax == billA){
                    bill[0] = bill[0]/2;
                } else {
                    bill[1] = bill[1]/2;
                }
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
