class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {

        Map<Integer, List<Integer>> xMap = new HashMap<>();
        Map<Integer, List<Integer>> yMap = new HashMap<>();

        for (int[] p : buildings) {
            int x = p[0], y = p[1];

            xMap.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            yMap.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        
        for (List<Integer> list : xMap.values()) Collections.sort(list);
        for (List<Integer> list : yMap.values()) Collections.sort(list);

        int count = 0;

        
        for (int[] p : buildings) {
            int x = p[0], y = p[1];

            List<Integer> yList = xMap.get(x); // all y's with same x
            List<Integer> xList = yMap.get(y); // all x's with same y

            boolean vertical = false, horizontal = false;

            
            if (yList.size() >= 3) {
                int minY = yList.get(0);
                int maxY = yList.get(yList.size() - 1);

                if (y > minY && y < maxY) {
                    vertical = true;
                }
            }

            
            if (xList.size() >= 3) {
                int minX = xList.get(0);
                int maxX = xList.get(xList.size() - 1);

                if (x > minX && x < maxX) {
                    horizontal = true;
                }
            }

            if (vertical && horizontal) count++;
        }

        return count;
    }
}
