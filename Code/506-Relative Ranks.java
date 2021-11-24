class Solution {
    public String[] findRelativeRanks(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        String[] res=new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        int i=1;
        for(Iterator<Integer> it=map.descendingKeySet().iterator();it.hasNext();){
            if(i==1){
                res[map.get(it.next())]="Gold Medal";
            }
            else if(i==2){
                res[map.get(it.next())]="Silver Medal";
            }
            else if(i==3){
                res[map.get(it.next())]="Bronze Medal";
            }
            else{
                res[map.get(it.next())]=i+"";
            }
            i++;
        }
        
        return res;
    }
};