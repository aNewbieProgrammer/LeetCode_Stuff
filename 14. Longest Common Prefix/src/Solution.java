public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder out = new StringBuilder();

        if (strs.length == 1) return strs[0];
        if (strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[1].length() <= i) break;
            if (strs[0].charAt(i) == strs[1].charAt(i)) {
                out.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        if (out.length() == 0) return "";
        String output = out.toString();

        for (int i = 2; i < strs.length; i++) {
            int index = Math.min(strs[i].length(), output.length());
            if (index == 0) return "";
            for (int j = 0; j < index; j++) {
                if (strs[i].charAt(j) != out.charAt(j)) {
                    output = strs[i].substring(0, j);
                    break;
                }
            }
            if (output.length() > strs[i].length()) output = strs[i];
            if (output.equals("")) return output;
        }

        return output;
    }

    public static void main(String[] args) {
        String strs[] = {"ac", "ac", "a", "a"};
        Solution sol = new Solution();
        System.out.println(sol.longestCommonPrefix(strs));
    }
}