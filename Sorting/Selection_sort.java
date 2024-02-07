package Sorting;

public class Selection_sort {
    public static void selectionSort(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {

            int small = i;

            for (int j = i; j < arr.length; j++) {
                if(arr[small] > arr[j]){
                    small = j;
                } 
            }
            sort(arr,i,small);
        }
    }
    public static void sort(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
