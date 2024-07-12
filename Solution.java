class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        int out = -1;

        for(int i=0; i<nums.length; i++){
            if(Math.abs(nums[i]-0) < closest){
                closest = Math.abs(nums[i]-0);
                out = nums[i];
            }else if(Math.abs(nums[i]-0) == closest){
                out = Math.max(out,nums[i]);
            }
        }
        return out;
    }
}
