#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        // Find the GCD of lengths
        int gcdLength = findGCD(str1.length(), str2.length());
       
        // Take a substring of length gcdLength
        string substring = str1.substr(0, gcdLength);

        // Check if the substring is a valid divisor for both strings
        if (isValidDivisor(str1, substring) && isValidDivisor(str2, substring)) {
            return substring;
        } else {
            return "";
        }
    }

private:
    // Function to find GCD of two numbers
    int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to check if substring is a valid divisor
    bool isValidDivisor(const string& s, const string& divisor) {
        int n = s.length();
        int m = divisor.length();

        if (n % m != 0) {
            return false;
        }

        for (int i = 0; i < n; i += m) {
            if (s.substr(i, m) != divisor) {
                return false;
            }
        }

        return true;
    }
};

int main() {
    Solution solution;

    // Example 1
    string str1_1 = "ABCABC";
    string str2_1 = "ABC";
    cout << "Example 1: " << solution.gcdOfStrings(str1_1, str2_1) << endl;

    // Example 2
    string str1_2 = "ABABAB";
    string str2_2 = "ABAB";
    cout << "Example 2: " << solution.gcdOfStrings(str1_2, str2_2) << endl;

    // Example 3
    string str1_3 = "LEET";
    string str2_3 = "CODE";
    cout << "Example 3: " << solution.gcdOfStrings(str1_3, str2_3) << endl;

    return 0;
}
