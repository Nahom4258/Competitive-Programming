class Solution {
    public void sortColors(int[] nums) {
        
        for(int i = 0; i<3; i++){   //color testing
            for(int j = 0; j<nums.length; j++){     //loop through the nums array
                for(int k = 0; k<nums.length; k++){
                    if(nums[k] == i){
                        int temp = nums[k];
                        nums[k] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        System.out.print("[");
        for(int i = 0; i<nums.length; i++){
            if(i != nums.length - 1)
                System.out.print(nums[i] + ",");
            else
                System.out.print(nums[i]);
        }
        System.out.print("]");
        
    }
}
