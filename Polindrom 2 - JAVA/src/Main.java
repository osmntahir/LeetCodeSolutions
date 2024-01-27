/*

680. Valid Palindrome II
Easy
Topics
Companies
Given a string s, return true if the s can be palindrome after deleting at most one character from it.



Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false


Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 */

class Solution {
    public boolean isPalindrome(String s , int start , int end)
    {
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++ ;
            end-- ;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left < right)
        {
            if(s.charAt(left)!= s.charAt(right))
            {
                if(isPalindrome(s,left+1,right)) return  true;
                if(isPalindrome(s,left,right-1)) return true;
                return  false;
            }
            left++;
            right--;

        }
        return  true;
    }

}
public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String x = "ebcbbececabbacecbbcbe";
        System.out.println(sl.validPalindrome(x));  // Output: true
    }
}
