// Runtime: 2 ms, faster than 98.82% of Java online submissions for Two Sum.
// Memory Usage: 37 MB, less than 98.95% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++) {
            map.put(target-nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i]) && (!map.get(nums[i]).equals(i))) {
                return new int[]{i, map.get(nums[i])};
            }
        }
        return new int[]{-1,-1};
    }
}