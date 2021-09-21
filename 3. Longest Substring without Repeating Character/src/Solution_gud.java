import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution_gud {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int max = 0;
        int left = 0;
        Arrays.fill(hash, -1);
        for (int right = 0; right < s.length(); right++) {
            if (hash[s.charAt(right)] < left) {
                hash[s.charAt(right)] = right;
                max = Math.max(max, right - left + 1);
            } else {
                left = hash[s.charAt(right)] + 1;
                right --;
            }
        }
        return max;
    }
}
