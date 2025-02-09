public class badPairs {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> pair = new HashMap<>();
        long count = 0;
        for(int i=0;i<nums.length;i++){
            count += -1 + pair.merge(nums[i]-i,1,Integer::sum);
        }
        int len = nums.length;
        return 1L*len*(len-1)/2-count;
    }
}
