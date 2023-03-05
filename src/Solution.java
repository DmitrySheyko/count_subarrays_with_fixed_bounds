/**
 * Class {@link Solution}. This class gets initial array and two int values. Method countSubarrays() should
 * calculate quantity of possible arrays inside initial array where max value will be equal first int instance
 * and min value will be equal second int instance.
 *
 * @author DmitrySheyko
 */

class Solution {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        boolean isMinIncluded = false;
        boolean isMaxIncluded = false;
        int minPosition = 0;
        int maxPosition = 0;
        int startIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                isMaxIncluded = false;
                isMinIncluded = false;
                startIndex = i + 1;
                continue;
            }
            if (nums[i] == maxK) {
                isMaxIncluded = true;
                maxPosition = i;
            }
            if (nums[i] == minK) {
                isMinIncluded = true;
                minPosition = i;
            }
            if (isMaxIncluded && isMinIncluded) {
                count = count + ((Math.min(minPosition, maxPosition) - startIndex) + 1);
            }
        }
        return count;
    }

}