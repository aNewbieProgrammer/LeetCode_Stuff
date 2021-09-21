public class Smart_Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String out = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(out) != 0) {
                out = out.substring(0, out.length() - 1);
            }
        }

        return out;
    }
}
