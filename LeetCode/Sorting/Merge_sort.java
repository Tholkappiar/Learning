package Sorting;

public class Merge_sort {
    public static void mergeSort(int[] arr, int l, int r){
        if(l>=r)
        {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1,r);
        merge(arr,l,mid,r);
    }

    static void merge(int [] arr,int l , int mid, int r)
    {
         int temp [] = new int[arr.length];
        int i =l;
        int left =l;
        int right=mid+1;
       while(left<=mid && right<=r)
       {
            if(arr[left]<=arr[right])
        {
            temp[i]=arr[left];
            left++;
        }
        else{
             temp[i]=arr[right];
             right++;
        }
        i++;
       }
        while(left<=mid)
       {
            temp[i]=arr[left];
            left++;
            i++;
       }
        while(right<=r)
       {
             temp[i]=arr[right];
             right++;
             i++;
       }
       for(int j=l;j<=r;j++)
       {
           arr[j]=temp[j];
       }
    }
}