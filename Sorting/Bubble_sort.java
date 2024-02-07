package Sorting;


public class Bubble_sort {
    public static void bubbleSort(int[] arr, int n) {
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    sort(arr, j, j+1);
                }
            }
            // System.out.println("large : " + arr[large]);
        }

    }
    public static void sort(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
