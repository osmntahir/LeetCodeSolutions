import java.util.ArrayList;

class Solution {
    ArrayList<Integer> tribonacciSequence = new ArrayList<Integer>();

    Solution() {
        tribonacciSequence.add(0);
        tribonacciSequence.add(1);
        tribonacciSequence.add(1);
    }

    public int tribonacci(int n) {
        if (n < 3) {
            return tribonacciSequence.get(n);
        }

        for (int i = 3; i <= n; i++) {
            int sum = tribonacciSequence.get(i -1) + tribonacciSequence.get(i  -2) + tribonacciSequence.get(i - 3);

            tribonacciSequence.add(sum);
        }

        return tribonacciSequence.get(n);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.tribonacci(3)); // Output: 1
        System.out.println(sl.tribonacci(4)); // Output: 2
        System.out.println(sl.tribonacci(25)); // Output: 1389537
    }
}
