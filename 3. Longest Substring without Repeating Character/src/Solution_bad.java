import java.util.Arrays;

public class Solution_bad {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[178];
        int counter = 0;
        int max_counter = 0;
        Arrays.fill(hash, 0);
        int i = 0;

        while (i != s.length()) {
            System.out.println("hash should be " + (((int)s.charAt(i))));
            if (hash[(((int)s.charAt(i)))] != 0) {
                if (counter > max_counter) max_counter = counter;
                i = hash[(((int)s.charAt(i)))];
                counter = 0;
                Arrays.fill(hash, 0);
            } else {
                hash[(int)s.charAt(i)] = i + 1;
                System.out.println("Safe at index " + i + " , which is: " + s.charAt(i));
                counter ++;
                i ++;
            }
        }
        if (counter > max_counter) max_counter = counter;
        return max_counter;
    }
}
