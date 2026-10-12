class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int i=0;i<nums.length; i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0; i<k; i++){
           int max = Collections.max(map.values());
          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                arr[i] = entry.getKey();
                map.remove(entry.getKey());
                break;
            }
        }
        }
        return arr;
    }
}
