package Algorithm.Sort;

public class MergeSort {

    public static int[] mergeSort(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while(pa<a.length&&pb<b.length){
            c[pc++] = a[pa] <= b[pb] ? a[pa++] : b[pb++];
        }

        //남은거 추가
        while(pa<a.length){
            c[pc++] = a[pa++];
        }
        while(pb<b.length){
            c[pc++] = b[pb++];
        }
        return c;
    }

    public static void main(String[] args){
        int[] a = {2,4,6,8,11,13};
        int[] b = {1,2,3,4,9,16,21};
        int[] c = mergeSort(a,b);
        for(int i:c) System.out.println(i);
    }
}
