class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        // [2,20,4,10,3,5]
        for(int num:nums){
            set.add(num);
        }
         int longest =0;
        for(int s:set){
           if(!set.contains(s-1)){
            int current = s;
            int length =1;
            while(set.contains(current+1)) {
               length++;
               current++;
            }
            longest = Math.max(longest,length);
           }
        }
        return longest;
    }
}
