package arraysAndString;

public class RemoveElementTask {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3) == 2);
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2) == 5);
    }

    static public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }
}
