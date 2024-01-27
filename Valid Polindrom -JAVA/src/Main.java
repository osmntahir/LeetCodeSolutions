class Solution {
    public boolean isPalindrome(String s) {
    int m = 0;
    int k = s.length()-1;
    while(m<k)
    {
        while(!Character.isLetterOrDigit(s.charAt(m)))
        {
            m++;
            if(m>=k) return true;
        }
        while(!Character.isLetterOrDigit(s.charAt(k)))
        {
            k--;
            if(m>=k) return true;
        }
        if(Character.toLowerCase(s.charAt(k))!= Character.toLowerCase(s.charAt(m)))
        {
            return false;
        }
        else
        {
            // it can be polindrom
        }
        m++;
        k--;
    }
    return true;

    }

}
public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String x = ".,";
        System.out.println(sl.isPalindrome(x));  // Output: true
    }
}
