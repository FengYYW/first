package AlgorithumTest;

import org.junit.Test;

public class InsertSort {

    public static int [] insertsort(int arr[]){
        for (int i = 1; i < arr.length; i++){
            //插入的数
            int insertVal = arr[i];
            //被插入的位置（准备和前一个数进行比较）
            int index = i-1;
            //如果插入的数比被插入的数小
            while(index >=0 && insertVal < arr[index]){
                //则将被插入的数向后移动
                arr[index+1] = arr[index];
                //将index向前移动
                index--;
            }
            arr[index+1] = insertVal;

        }
        return arr;
    }

    @Test
    public void  test(){
        int arr[]=new int[] {6,2,5,7,8};
        insertsort(arr);
        System.out.println();
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
