package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {22,30,-1,0,100,-40,35};

        for(int lastSortedIndex = intArray.length-1;lastSortedIndex > 0;lastSortedIndex --){
            int largestIndex = 0;
            for(int i=1;i <= lastSortedIndex;i++){
                if(intArray[i] > intArray[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(intArray,largestIndex,lastSortedIndex);
        }

        Arrays.stream(intArray).asLongStream().forEach(i -> System.out.println(" soring :"+i));
        System.out.println(intArray);
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
