class Solution {
    public List<List<Integer>> findSubArray(int[] arr, int i,
                                            List<Integer> sub,
                                            List<List<Integer>> list,
                                            int tar, int sum) {

        if (i == arr.length) {
            if (tar == sum) {
                list.add(new ArrayList<>(sub));
            }
            return list;
        }

        // Pick
        if (sum + arr[i] <= tar) {
            sum += arr[i];
            sub.add(arr[i]);

            findSubArray(arr, i, sub, list, tar, sum);

            sum -= arr[i];
            sub.remove(sub.size() - 1);
        }

        // Not Pick
        findSubArray(arr, i + 1, sub, list, tar, sum);

        return list;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        return findSubArray(candidates, 0, sub, list, target, 0);
    }
}