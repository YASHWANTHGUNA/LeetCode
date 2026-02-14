class Solution {
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        brute(candidates, target, new ArrayList<>());
        return new ArrayList<>(set);
    }

    private void brute(int[] candidates, int target, List<Integer> path) {
        if (target == 0) {
            List<Integer> temp = new ArrayList<>(path);
            Collections.sort(temp);      // normalize
            set.add(temp);
            return;
        }
        if (target < 0) return;

        for (int i = 0; i < candidates.length; i++) {
            path.add(candidates[i]);
            brute(candidates, target - candidates[i], path);
            path.remove(path.size() - 1);
        }
    }
}
