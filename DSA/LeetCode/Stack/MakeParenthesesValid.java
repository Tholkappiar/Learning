class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
           if(!stack.isEmpty() && stack.peek() == '('){
                if(ch==')'){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
           }
           else if(!stack.isEmpty() && stack.peek() == ')'){
                stack.push(ch);
           }
           else if(stack.isEmpty())
                stack.push(ch);
        }

        return stack.size();
    }
}