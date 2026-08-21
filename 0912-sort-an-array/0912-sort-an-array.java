class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    void mergeSort(int[] M) {
        if(M.length <= 1) return;

        int half = M.length / 2;
        int[] L = new int[half];
        int[] R = new int[M.length - half];

        int i = 0, j = 0, k = 0;
        while(i < L.length) L[i++] = M[k++];
        while(j < R.length) R[j++] = M[k++];

        mergeSort(L);
        mergeSort(R);

        merge(M, L, R);
    }

    void merge(int[] M, int[] L, int[] R) {
        int i = 0, j = 0, k = 0;

        while(i < L.length && j < R.length) {
            if(L[i] < R[j]) {
                M[k++] = L[i++];
            } else {
                M[k++] = R[j++];
            } 
        }

        while(i < L.length) M[k++] = L[i++];
        while(j < R.length) M[k++] = R[j++];
    } 
}