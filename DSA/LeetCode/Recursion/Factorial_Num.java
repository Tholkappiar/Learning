package Recursion;

import java.util.ArrayList;
import java.util.List;
public class Factorial_Num {
    static long ans = 1;
    static List<Long> list = new ArrayList<Long>();

    public static List<Long> factorialNumbers(long n) {
        return fact(n, 1);
    }
    public static List<Long> fact(long n,long num){
        ans = ans * num;
        if(ans > n)
            return list;
        list.add(ans);
        return fact(n, num+1);
    }
}
