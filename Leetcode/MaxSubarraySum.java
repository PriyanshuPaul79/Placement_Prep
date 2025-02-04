package Leetcode;

public class MaxSubarraySum {
    public int answer(int nums[]){
        int ans= nums[0], res= nums[0];
        for(int i=1;i<nums.length;i++){
            ans = nums[i]>nums[i-1]? ans+nums[i]: nums[i];
            res= Math.max(ans,res);
        } return res;
    }
}
