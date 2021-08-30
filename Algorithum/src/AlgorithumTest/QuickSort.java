package AlgorithumTest;

import org.junit.Test;

public class QuickSort {

    public static int[] quicksort(int []arr ,int low ,int high){
        int dis = arr[low];
        int start = low;
        int end = high;

        while(end > start){

            while( end > start && arr[end] > dis)
                end--;
            if (arr[end] <  dis){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }

            while (end >start && arr[start] < dis)
                start++;
            if (arr[start] > dis){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        if (start > low){
            quicksort( arr,low,start-1);
        }
        if (end < high){
            quicksort(arr,end+1,high);
        }

        return  arr;
    }

    @Test
    public  void  test(){
        int arr[] = new int[]{6,9,5,7,8};
        quicksort(arr,0,arr.length-1);
        for (int i =0;i <arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
