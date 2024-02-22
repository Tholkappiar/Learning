class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        int j = 0;

        for( int i = 0 ; i < len ; i++ ) {
            char ch = s.charAt(i);
            if(!hs.contains(ch)) {
                hs.add(ch);
                count = Math.max(count,i-j+1);
            } else {
                while(hs.contains(ch)){
                    hs.remove(s.charAt(j));
                    j++;
                }
                hs.add(ch);
            }
        }
        return count;
    }
}