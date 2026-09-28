class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        for(int i =0,j=c.length-1;i<j;){
            if(!Character.isLetterOrDigit(c[i])){
                i++;
                continue;
            }
             if(!Character.isLetterOrDigit(c[j])){
                j--;
                continue;
            }
            if(c[i++]!=c[j--])return false;
        }
        return true;
    }
}
