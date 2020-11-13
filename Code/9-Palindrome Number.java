class Solution {
    public boolean isPalindrome(int x) {
        if  (x<0){
            return false;
        }else {
        int b=0;
        int c=x;
        while (x!=0){
            b=b*10+x%10;
            x/=10;
        }
        return b==c;
        }
    }  
}