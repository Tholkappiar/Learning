package Recursion;

public class Check_Palindrome {
    public static boolean isPalindrome(String str) {
        return Palindrome(str,0, str.length()-1);
    }
    public static boolean Palindrome(String str,int i, int j){
        if(i>=j)
            return true;
        if(str.charAt(i)!=str.charAt(j))
            return false;
        return Palindrome(str,i+1, j-1);
    }
}

