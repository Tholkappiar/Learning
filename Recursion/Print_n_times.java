package Recursion;

import java.util.List;
import java.util.ArrayList;

public class Print_n_times {
    static List<String> stringList = new ArrayList<String>();
    public static List<String> printNtimes(int n){
        if(n==0){
            return stringList;
        }
        stringList.add("Coding Ninjas");
        printNtimes(n-1);
        return stringList;
    }

}
