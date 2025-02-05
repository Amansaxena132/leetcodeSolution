class Solution {

    public boolean canJump(int[] nums) {
        int flag = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= flag) {
                flag = i;
            }
        }

        return flag==0;
    }
}
