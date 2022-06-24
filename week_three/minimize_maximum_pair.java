class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i == nums.length/2)
                break;
            if(nums[i] + nums[nums.length-1-i] > max)
                max = nums[i] + nums[nums.length-1-i];
        }
        return max;
    }
}
