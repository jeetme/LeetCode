class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            boolean isGreaterThanLeft = mid == 0 || arr[mid] > arr[mid - 1];
            boolean isGreaterThanRight = mid == arr.length - 1 || arr[mid] > arr[mid + 1];
            if(isGreaterThanLeft && isGreaterThanRight) {
                return mid;
            } else if(isGreaterThanLeft) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}