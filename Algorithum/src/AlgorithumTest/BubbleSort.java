package AlgorithumTest;

import org.junit.Test;

public class BubbleSort {

    public static int[] bubblesort(int arr[]){
        for (int i = 0;i <arr.length -1;i++){
            for (int j =0; j<arr.length -1 -i;j++){
               if (arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
        return  arr;
    }

    @Test
    public void test(){
        int arr[]=new int[]{6,5,2,7,8};
        bubblesort(arr);
        for (int i = 0; i <arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }
}
