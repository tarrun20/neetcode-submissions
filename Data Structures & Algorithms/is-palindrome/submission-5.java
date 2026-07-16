class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String lower = s.toLowerCase();
        while(i<j)
        {
            while((i<j && !Character.isLetterOrDigit(lower.charAt(i))))
            {
                i++;
            }
            while((i<j && !Character.isLetterOrDigit(lower.charAt(j))))
            {
                j--;
            }
            if(lower.charAt(i)!=lower.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
