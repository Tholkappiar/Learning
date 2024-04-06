public class Palindrome_number {
    public static boolean palindromeNumber(int n){
        
        // int temp = n;

        // int last = 0;
        // int ans = 0;

        // while(n>0){
        //     last = n%10;
        //     ans = ans * 10 + last;
        //     n=n/10;
        // }
        // return temp == ans;

        String str = String.valueOf(n);
        for(int i=0,j=str.length()-1 ; i<j ; i++,j--){
            if(!(str.charAt(i)==str.charAt(j))){
                return false;
            }
        }
        return true;

        // using StringBuilder
        // String str = String.valueOf(n);
        // StringBuilder sb = new StringBuilder(str);
        // return str.equals(sb.reverse().toString());
    }
}