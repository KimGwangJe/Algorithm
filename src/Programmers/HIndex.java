package Programmers;

import java.util.Arrays;

//고득점 키트 정렬문제
//H-Index 문제

public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        return get(citations, 0, citations.length-1);
    }

    public int get(int[] arr, int start, int end){
        if(start > end){
            return arr.length - start;
        }

        int idx = (start+end)/2;
        int h = arr.length - idx;

        if(arr[idx] == h){
            return h;
        }
        if(arr[idx] < h){
            return get(arr, idx+1, end);
        }
        if(arr[idx] > h){
            return get(arr, start, idx-1);
        }
        return 0;
    }
}