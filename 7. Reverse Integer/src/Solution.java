public class Solution {
    public int reverse(int x) {
        int Limit = Integer.MAX_VALUE;
        int copy = x;
        int output = 0;
        int actual_counter = 0;
        int target = 1;
        if (x < 0) {
            copy = -x;
        }
        while (copy >= target) {
            copy = copy / 10;
            actual_counter += 1;
        }

        if (x < 0) {
            copy = -x;
        } else {
            copy = x;
        }

        while (copy >= target) {
            output += (copy % 10) * Math.pow(10, actual_counter - 1);
            if (Limit <= Math.pow(10, actual_counter)) {
                return 0;
            }
            Limit -= Math.pow(10, actual_counter);
            copy = copy / 10;
            actual_counter -= 1;
        }
        if (x < 0) {
            return -output;
        }
        return output;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(9000));
    }
}
