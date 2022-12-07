//https://leetcode.com/problems/find-the-duplicate-number/submissions


public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {

        int length = nums.length-1;
        int expected = (length*(length+1))/2;
        int actualSum = 0;
        for(int i = 0 ; i<length+1;i++)
        {
            actualSum = actualSum+nums[i];
        }

        return actualSum-expected;

    }

}
