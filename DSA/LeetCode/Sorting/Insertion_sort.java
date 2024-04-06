package Sorting;

public class Insertion_sort {
    public static void insertionSort(int[] arr, int size) {

        for (int i = 0; i < arr.length; i++){
	        for(int j = i ; j > 0 && arr[j-1] > arr[j]; j--){
	            swap(arr,j-1,j);
	        }
	    } 
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
