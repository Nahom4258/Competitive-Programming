# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        count = 0
        myHead = head

        while (copy):
            if myHead == None:
                break
            count += 1
            myHead = myHead.next

        for i in range(int(math.floor(count/2))):
            head = head.next
            
        return head
        