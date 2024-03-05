package Recursion;

public class Reverse_print
{
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return numbers(arr, x, 0);
    }
    public static int[] numbers(int[] arr, int x,int i){
        if(x==0)
            return arr;
        arr[i] = x;
        return numbers(arr, x-1,i+1);
    }
}
