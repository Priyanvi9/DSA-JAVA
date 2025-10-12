package DAY15;

public class minSubArrayLCques {
    public static void main(String[] args) {
        int[] nums = {6, 4, 9, 1, 7, 3};
        int target = 10;
        System.out.println(new minSubArrayLCques().minSubArrayLen(target, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        long currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}