import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int back = nums.length - 1;
        int front = 0;
        if (nums.length == 0) return 0;
        while (back >= front) {
            if (nums[back] == val) {
                back --;
                continue;
            }
            if (nums[front] == val) {
                nums[front] = nums[back];
                nums[back] = val;
            }
            front ++;
        }
        System.out.println("Counter is: " + back + 1);
        System.out.println("Final array: " + Arrays.toString(nums));
        return back;
    }

    public static void main(String[] args) {
        int[] nums_1 = {0,1,2,2,3,0,4,2};
        int[] nums_2 = {3,2,2,3};
        int[] nums_3 = {2, 3, 3};
        int[] nums_4 = {1, 2, 3, 4};
        Solution sol = new Solution();
        System.out.println(sol.removeElement(nums_4, 1));
    }
}
