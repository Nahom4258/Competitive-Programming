class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        holder, answer = [], 0
        for i in nums:
            answer += i
            holder.append(answer)
        for i, val in enumerate(nums):
            prev = holder[i] - val
            nxt = holder[len(holder) - 1] - holder[i]
            if prev == nxt:
                return i
        return -1