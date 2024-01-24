
/*
* 136. Single Number
Easy
Topics
Companies
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*
* */
class Solution {

    public int singleNumber(int[] nums) {
        boolean[] isMatched = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            isMatched[i] = false;
        }

        int i = 0;
        while (i < nums.length) {
            if (!isMatched[i]) {
                int temp = nums[i];
                boolean found = false;

                for (int j = i + 1; j < nums.length; j++) {
                    if (!isMatched[j] && temp == nums[j]) {
                        isMatched[i] = true;
                        isMatched[j] = true;
                        found = true;
                        break; // Break out of the loop if a pair is found
                    }
                }

                if (!found) {
                    return temp; // If no pair is found, temp is the single number
                }
            }

            i++;
        }

        return 0; // Default return if no single number is found
    }
}


public class Main {
    public static void main(String[] args) {
        int [] nums1 = {2,2,1};
        int [] nums = {1,2,1,2,4};
        int [] nums2 = {1};
        int [] nums3 = {1,0,1};
        Solution sl = new Solution();
        System.out.println(String.valueOf(sl.singleNumber(nums1)));
        System.out.println(String.valueOf(sl.singleNumber(nums)));
        System.out.println(String.valueOf(sl.singleNumber(nums2)));
        System.out.println(String.valueOf(sl.singleNumber(nums3)));



    }
}