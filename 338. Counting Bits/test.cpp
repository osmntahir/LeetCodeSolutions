#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    std::vector<int> countBits(int n) {
        std::vector<int> result(n +1, 0);

        for (int i = 1; i <= n; ++i) {
            // Use the previously computed result for i/2 and add the least significant bit
		
            result[i] = result[i / 2] + (i % 2);
        }

        return result;
    }
};

int main() {
    Solution sl;
    
    // Example 1
    int n1 = 2;
    std::vector<int> result1 = sl.countBits(n1);
    std::cout << "Example 1:  num = 2   [";
    for (int num : result1) {
        std::cout << num << ", ";
    }
    std::cout << "]\n";

    // Example 2
    int n2 = 5;
    std::vector<int> result2 = sl.countBits(n2);
    std::cout << "Example 2:  num = 5  [";
    for (int num : result2) {
        std::cout << num << ", ";
    }
    std::cout << "]\n";

    return 0;
}
