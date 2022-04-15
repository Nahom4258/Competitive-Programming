class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNum = new int[nums.length];
        
        for(int i = 0; i<nums.length; i++){     //iterate through the array
            int counter = 0;
            
            for(int j = 0; j<nums.length; j++){     //check numbers with array[i]
                if(i != j && nums[i] > nums[j])
                    counter++;
            }
            
            smallerNum[i] = counter;
        }
        
        return smallerNum;
    }
}
