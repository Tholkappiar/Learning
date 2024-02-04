public class gcd {
    public static int calcGCD(int n, int m){
        int r = 0;
        while(n%m>0){
            r = n%m;
            n = m;
            m = r;
        }
        return m;
    }
}