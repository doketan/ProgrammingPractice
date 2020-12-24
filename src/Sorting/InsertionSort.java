package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {22,30,-1,0,100,-40,35};

        for(int firstUnsortedIndex = 1;firstUnsortedIndex < intArray.length;firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i > 0 && intArray[i-1] > newElement;i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        Arrays.stream(intArray).asLongStream().forEach(i -> System.out.println(" soring :"+i));
    }
}
