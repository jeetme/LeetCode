class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mStep = m - 1, nStep = n - 1, i = m + n - 1;
        while (nStep >= 0) {
            if (mStep >= 0 && nums1[mStep] > nums2[nStep]) {
                nums1[i--] = nums1[mStep--];
            } else {
                nums1[i--] = nums2[nStep--];
            }
        }
    }
}