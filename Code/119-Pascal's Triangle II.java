class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new LinkedList<>();
         res.add(1);
        if (rowIndex == 0) return res;
        int t = rowIndex, b = 1;
        long cur = 1;
        for(int i = 1; i < rowIndex+1; i++){
            cur = cur * t;
            cur = cur / b;
            res.add((int)cur);
            t--;b++;
        }
        return res;
    }
}