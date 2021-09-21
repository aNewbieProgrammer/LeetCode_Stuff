public class Solution {

    public String tictactoe(int [][] moves) {
        int [][] map = new int[3][3];
        int last_turn = moves.length;
        for (int i = 0; i < last_turn; i++) {
            if ((i + 2) % 2 == 0) {
                map[moves[i][0]][moves[i][1]] = 1;
            } else {
                map[moves[i][0]][moves[i][1]] = 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (map[i][0] == map[i][1] && map[i][0] == map[i][2]) {
                if (map[i][0] == 1) return "A";
                else if (map[i][0] == 2) return "B";
            }
        }

        for (int i = 0; i < 3; i++) {
            if (map[0][i] == map[1][i] && map[1][i] == map[2][i]) {
                if (map[1][i] == 1) return "A";
                else if (map[1][i] == 2) return "B";
            }
        }

        if (map[0][0] == map[1][1] && map[1][1] == map[2][2]) {
            if (map[1][1] == 1) return "A";
            else if (map[1][1] == 2) return "B";
        }

        if (map[0][2] == map[1][1] && map[1][1] == map[2][0]) {
            if (map[1][1] == 1) return "A";
            else if (map[1][1] == 2) return "B";
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == 0) {
                    return "Pending";
                }
            }
        }
        return "Draw";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] moves1 = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        int[][] moves2 = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        int[][] moves3 = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        int[][] moves4 = {{0,1},{1,1}};
        int[][] moves5 = {{0,0},{1,2},{0,2},{1,1}};
        System.out.println(sol.tictactoe(moves1));
        System.out.println(sol.tictactoe(moves2));
        System.out.println(sol.tictactoe(moves3));
        System.out.println(sol.tictactoe(moves4));
        System.out.println(sol.tictactoe(moves5));
    }
}
