public class Solution {
    public String longestPalindrome(String s) {
        String output = "";
        int max_len = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            int left;
            int right;
            left = i;
            right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                counter = right - left + 1;
                if (counter > max_len) {
                    max_len = counter;
                    output = s.substring(left, right + 1);
                }
                left -= 1;
                right += 1;
            }
            if (counter == 0) {
                output = s.substring(0, 1);
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                counter = right - left + 1;
                if (counter > max_len) {
                    max_len = counter;
                    output = s.substring(left, right + 1);
                }
                left -= 1;
                right += 1;
            }
            if (counter == 0) {
                output = s.substring(0, 1);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestPalindrome("acbb"));
    }
}
