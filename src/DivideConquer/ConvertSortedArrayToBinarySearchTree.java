package DivideConquer;
/*
*
Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
binary search tree.
*
* */
public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        return createTreeNode(nums, 0, nums.length - 1);
    }

    private static TreeNode createTreeNode(int[] nums, int l, int r) {
        if (l > r) return null;
        int middle = (l + r) / 2;
        TreeNode root = new TreeNode(nums[middle]);

        root.left = createTreeNode(nums, l, middle - 1);
        root.right = createTreeNode(nums, r, middle + 1);

        return root;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
