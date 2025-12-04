class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        int flag1=0, flag2=0, flag3=0, flag4=0, flag5=0, flag6=0, flag7=0, flag8=0;

        int x = king[0];
        int y = king[1];

        List<List<Integer>> twoDList = new ArrayList<>();
        for (int i = 0; i < queens.length; i++) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < queens[i].length; j++) {
                rowList.add(queens[i][j]);
            }
            twoDList.add(rowList);
        }

        List<List<Integer>> arr = new ArrayList<>();
        int i = 1;

        while (true) {

            // Up
            if (x-i >= 0) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x-i); dum.add(y);
                if (twoDList.contains(dum) && flag1 == 0) {
                    arr.add(dum);
                    flag1 = 1;
                }
            }

            // Down
            if (x+i <= 7) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x+i); dum.add(y);
                if (twoDList.contains(dum) && flag2 == 0) {
                    arr.add(dum);
                    flag2 = 1;
                }
            }

            // Left
            if (y-i >= 0) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x); dum.add(y-i);
                if (twoDList.contains(dum) && flag3 == 0) {
                    arr.add(dum);
                    flag3 = 1;
                }
            }

            // Right
            if (y+i <= 7) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x); dum.add(y+i);
                if (twoDList.contains(dum) && flag4 == 0) {
                    arr.add(dum);
                    flag4 = 1;
                }
            }

            // Down-left
            if (x+i <= 7 && y-i >= 0) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x+i); dum.add(y-i);
                if (twoDList.contains(dum) && flag5 == 0) {
                    arr.add(dum);
                    flag5 = 1;
                }
            }

            // Up-right
            if (x-i >= 0 && y+i <= 7) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x-i); dum.add(y+i);
                if (twoDList.contains(dum) && flag6 == 0) {
                    arr.add(dum);
                    flag6 = 1;
                }
            }

            // Up-left
            if (x-i >= 0 && y-i >= 0) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x-i); dum.add(y-i);
                if (twoDList.contains(dum) && flag7 == 0) {
                    arr.add(dum);
                    flag7 = 1;
                }
            }

            // Down-right
            if (x+i <= 7 && y+i <= 7) {
                List<Integer> dum = new ArrayList<>();
                dum.add(x+i); dum.add(y+i);
                if (twoDList.contains(dum) && flag8 == 0) {
                    arr.add(dum);
                    flag8 = 1;
                }
            }

            if (flag1==1 && flag2==1 && flag3==1 && flag4==1 &&
                flag5==1 && flag6==1 && flag7==1 && flag8==1)
                break;

            if (x-i < 0 && x+i > 7 && y-i < 0 && y+i > 7)
                break;

            i++;
        }

        return arr;
    }
}
