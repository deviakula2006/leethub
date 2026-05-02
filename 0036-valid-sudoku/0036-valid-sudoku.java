import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<Integer, HashSet<Character>> grid = new HashMap<>();

        for(int i = 0; i < 9; i++){
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            grid.put(i, new HashSet<>());
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                char c = board[i][j];

                if(c == '.') continue;

                int ind = (i/3) * 3 + (j/3);

                if(row.get(i).contains(c) ||
                   col.get(j).contains(c) ||
                   grid.get(ind).contains(c)) {
                    return false;
                }

                row.get(i).add(c);
                col.get(j).add(c);
                grid.get(ind).add(c);
            }
        }

        return true;
    }
}