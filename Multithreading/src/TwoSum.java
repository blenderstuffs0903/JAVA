public class TwoSum {
    public static void main(String[] args) {

    Solution soln = new Solution();
    int[] a = soln.twoSum(new int[]{1 ,3 , 3}, 6);

    for (int i : a) {
        System.out.println(i);
    }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
    return new int[]{-1, -1};
    }
}
