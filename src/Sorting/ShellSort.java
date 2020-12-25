package Sorting;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = {22,30,-1,0,100,-40,35};

        for(int gap=intArray.length/2; gap > 0; gap /=2 ){

            for(int i=gap; i < intArray.length; i++ ){
                int newElement = intArray[i];

                int j=i;

                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -=gap;
                }
                intArray[j]=newElement;
            }

        }

        Arrays.stream(intArray).asLongStream().forEach(i -> System.out.println(" soring :"+i));


    }
}
