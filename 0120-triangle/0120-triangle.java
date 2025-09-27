class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        List<List<Integer>> dp = new ArrayList<>();

    // First row
    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(tri.get(0).get(0));
    dp.add(firstRow);

    for (int i = 1; i < tri.size(); i++) {
        List<Integer> row = new ArrayList<>();
        int n = tri.get(i).size();
        List<Integer> prevRow = dp.get(i - 1);

        for (int j = 0; j < n; j++) {
            if (j == 0) {
                row.add(tri.get(i).get(j) + prevRow.get(0));
            } else if (j == n - 1) {
                row.add(tri.get(i).get(j) + prevRow.get(prevRow.size() - 1));
            } else {
                row.add(tri.get(i).get(j) + Math.min(prevRow.get(j - 1), prevRow.get(j)));
            }
        }

        dp.add(row); // Add the computed row to dp
    }

    List<Integer> lastRow = dp.get(dp.size() - 1);
    int min = Collections.min(lastRow);

    return min;
    }
}