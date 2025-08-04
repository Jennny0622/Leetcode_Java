# 203. Remove Linked List Elements (Java Solution)

[LeetCode Link](https://leetcode.com/problems/remove-linked-list-elements/)  
Difficulty: Easy  
Topics: Linked List, Recursion

---

## Problem Description

Given the head of a linked list and an integer val, 
remove all the nodes of the linked list that has Node.val == val, 
and return the new head.
---

## Approach (Recursive)

This solution uses recursion to process the list from the end toward the front.

### Steps:

1. Recursively call the function to process the rest of the list:  
   `result = removeElements(head.next, val)`
2. Then check if the current node (`head`) should be kept:
   - If `head.val != val`, link it to the result and return `head`
   - If `head.val == val`, skip this node and return `result`

---

## Java Code

```java
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode result = removeElements(head.next, val);
        if (head.val != val) {
            head.next = result;
            return head;
        }
        return result;
    }
}
