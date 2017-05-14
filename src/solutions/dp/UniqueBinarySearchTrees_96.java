package solutions.dp;

/**
 * Created by Calabash on 2017/5/14.
 * The LeetCode 96th
 * Description : https://leetcode.com/problems/unique-binary-search-trees/#/description
 * Tags : Tree, Dynamic Programming
 */
public class UniqueBinarySearchTrees_96 {

    /**
     * Status : Accepted
     * Runtime : 0ms
     */
    public int numTrees(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i ++) {
            int num = 2 * nums[i - 1];
            for (int j = 1; j < (i - 1); j++) {
                num += (nums[j] * nums[i - 1 - j]);
            }
            nums[i] = num;
        }
        return nums[n];
    }
}
