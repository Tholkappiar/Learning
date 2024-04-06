public class count_digits {
    public static int countDigits(int n){

        int num = n;
        int count = 0;
        while(n>0){
            int last = n % 10;
            if((last!=0) && (num%last==0)){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}