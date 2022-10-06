class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        counter = 0
        size = len(nums)
        while(counter < size):
            if nums[counter] == 0:
                del nums[counter]
                nums.append(0)
                size -= 1
                counter = 0
                continue
                
            counter += 1
        