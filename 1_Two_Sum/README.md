# 1. Two Sum (Java Solution)

[LeetCode Link](https://leetcode.com/problems/two-sum/)  
Difficulty: Easy  
Topics: Array, Hash Table

---

## Problem Description

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.  
You can return the answer in any order.

---

## Approach

This Java solution uses a loop approach:

- Iterate through the array using index `i`
- For each `i`, loop through the rest of the elements using `j = i + 1`
- If `nums[i] + nums[j] == target`, store and return the indices

---

## Java Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
