public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String out = "The cat in the hat";
        StringBuilder output = new StringBuilder();
        int left = -1;
        int right = 0;
        for (right = 0; right < out.length(); right++) {
            if (out.charAt(right) == ' ') {
                int temp_left = left;
                int temp_right = right;
                while (temp_left != temp_right) {
                    output.append(out.charAt(temp_right));
                    temp_right--;
                }
                left = right;
            }
        }
        output.append(" ");
        int temp_left = left;
        int temp_right = right - 1;
        while (temp_left != temp_right) {
            output.append(out.charAt(temp_right));
            temp_right--;
        }
        System.out.println(output.toString());
    }
}
