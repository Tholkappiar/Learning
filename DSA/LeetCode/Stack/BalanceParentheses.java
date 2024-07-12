class Solution {
    public int minInsertions(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;
        int len = s.length();
        
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    count++;
                }
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                } else {
                    count++;
                }
            } else {
                stack.push(ch);
            }
        }

        return count + stack.size()*2;
    }
}
