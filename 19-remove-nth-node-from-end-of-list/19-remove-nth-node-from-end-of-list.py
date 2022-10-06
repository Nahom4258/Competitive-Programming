# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        size = 0
        myHead = head
        
        while(1):   #count size of linked list
            if myHead == None:
                break
            size += 1
            myHead = myHead.next
            
        if size == 1:   # return head = None if there is only one node
            return None
        
        if size == n:   # if size and removed node are equal, return the first node as head
            return head.next
            
        temp = ListNode(0, head)    #add temp node before head
            
        for i in range(size - n):   #iterate to node before nth from the end position
            temp = temp.next
            
        temp.next = temp.next.next  #cut out the middle part (nth from the end position)
        
        return head
        
        