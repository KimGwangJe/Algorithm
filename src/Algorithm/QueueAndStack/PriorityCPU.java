package Algorithm.QueueAndStack;

/**
 * 0번부터 n-1번까지 작업번호가 있는 n개의 작업이 있습니다.
 * 각 작업은 [호출시간, 실행시간]으로 정보가 표현됩니다. 예를 들어 어떤 작업의 정보가 [2, 3] 이면 0초부터 시작하여 흐르는 시간에서 2초에 작업호출되어 대기상태에 들어가며 자 신의 차례가 되면 3초동안 실행된 뒤 종료됩니다.
 * cpu는 다음과 같은 규칙에 의해서 작업을 실행시킵니다.
 * 1) 한 번에 한 개의 작업을 할 수 있고, 한 번 실행된 작업은 중간에 멈추지 않습니다.
 * 2) 대기상태에 있는 작업이 많을 경우 그 중 실행시간이 가장 작은 작업을 먼저 처리하며, 실 행시간이 같은 작업의 경우는 작업번호가 작은 것을 먼저 처리합니다.
 * 3) cpu는 한 작업이 끝나면 바로 다른 작업을 할 수 있습니다. 만약 어떤 작업이 5초에 끝나 면 5초에 바로 다른 작업을 할 수 있습니다.
 * 매개변수 tasks에 0번 작업부터 순서대로 각 작업의 정보가 주어지면 Cpu가 처리하는 작업의 순서대로 작업번호를 배열에 담아 반환하는 프로그램을 작성하세요.
*/

public class PriorityCPU {
    public static void main(String[] args) {
//        int[][] tasks = {{2,3},{1,2},{8,2},{3,1},{10,2}};
//        int[][] tasks = {{5,2},{7,3},{1,3},{1,5},{2,2},{1,1}};
        int[][] tasks = {{1,2},{2,3},{1,3},{3,3},{8,2},{1,5},{2,2},{1,1}};
        int[] answer = new int[tasks.length];
        int answerIdx = 1; //answer에 값을 넣을거
        int left = Integer.MAX_VALUE;//0
        int right = Integer.MAX_VALUE;//1
        int count = 0; //현재 시간
        int min = 0; // 가장 작은 인덱스

        //첫번째 실행될 놈 선택
        for(int i = 0; i < tasks.length; i++){
            if(left >= tasks[i][0] && right > tasks[i][1]){
                left = tasks[i][0];
                right = tasks[i][1];
                min = i;
            }
        }
        answer[0] = min;
        count+=left+right;
        tasks[min][0] = Integer.MAX_VALUE;
        tasks[min][1] = Integer.MAX_VALUE;
        right = Integer.MAX_VALUE;

        boolean a = true;

        while(answerIdx < tasks.length){
            for(int i = 0; i < tasks.length; i++){
                if(count >= tasks[i][0] && tasks[i][1] < right){
                    right = tasks[i][1];
                    min = i;
                    a = false;
                }
            }
            if(a){
                count++;
            } else{
                a = true;
                answer[answerIdx++] = min;
                count+=right;
                tasks[min][0] = Integer.MAX_VALUE;
                tasks[min][1] = Integer.MAX_VALUE;
                right = Integer.MAX_VALUE;
            }
        }
        for(int i: answer) System.out.println(i);
    }
}
