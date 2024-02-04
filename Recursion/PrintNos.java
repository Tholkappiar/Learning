package Recursion;

public class PrintNos {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return numbers(arr, 0);
    }
    public static int[] numbers(int[] arr,int n){
        if(n==arr.length)
            return arr;
        arr[n] = n+1;
        return numbers(arr, n+1);
        
    }
 }
