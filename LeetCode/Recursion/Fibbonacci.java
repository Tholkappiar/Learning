package Recursion;

public class Fibbonacci {
    public static int[] generateFibonacciNumbers(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        if(n==1)
            return arr;
        if(n>1)
            arr[1] = 1;
        return fibo(arr, 0, 1, 2,n);
    }
    public static int[] fibo(int[] arr, int a, int b, int i,int n){
        if(i==n)
            return arr;
        int c = a+b;
        arr[i] = c;
        return fibo(arr, b, c,i+1,n);
    }
}
