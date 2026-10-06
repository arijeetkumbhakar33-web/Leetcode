class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int rem = x % 10;
            x /= 10;

            // check for overflow
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }

            ans = ans * 10 + rem;
        }
        return ans; // return the reversed number
    }
}
