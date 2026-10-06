class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> there = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (there.contains(nums[i])) {
                return true;
            }
            there.add(nums[i]);
        }
        return false;
    }
}