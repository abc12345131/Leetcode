class Solution {
    public int hammingDistance(int x, int y) {
        int result=0;
        if(x == y)
            return result;
        int diffOfBits = x^y;
        
        return noOfOnes(diffOfBits);
    }
     private int noOfOnes(int no){
        int count = 0;
        while(no != 0){
             no = no & (no-1);
            count++;
        }
        return count;
        
    }
};