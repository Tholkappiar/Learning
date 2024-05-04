class Solution {
    public int myAtoi(String s) {
      
      s = s.trim();
      if(s.length() <= 0){
        return 0;
      }
      int ans = 0, temp = 0, sign = 1;
      int i = 0;
      if(s.charAt(i) == '-' || s.charAt(i) == '+'){
        if(s.charAt(i) == '-'){
            sign = -1;
        }
        i++;
      }

      for(;i<s.length();i++) {
        char ch = s.charAt(i);
        if(Character.isDigit(ch)){
            int digit = Integer.parseInt(Character.toString(ch));
            if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;       
            }
            ans = digit + (temp*10);
            temp = ans;
        } else {
            break;
        }
      }

      return ans*sign;
    }
}
