class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int u = 2;

        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[u - 2]) {
                nums[u]=nums[i];
                u++;
            }
        }

        return u;
    }
}
