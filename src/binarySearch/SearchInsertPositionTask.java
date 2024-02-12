package binarySearch;

/*
* 35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found.
* If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
* */
public class SearchInsertPositionTask {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5) == 2);
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 4) == 2);
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5) == 2);
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2) == 1);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            int element = nums[middle];

            if (target == element) {
                return middle;
            }

            if (target > element) {
                left = middle + 1;
            }

            if (target < element) {
                right = middle - 1;
            }
        }

        return left;
    }
}
