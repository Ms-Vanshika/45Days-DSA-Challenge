class findduplicatenumber {
    public int findDuplicate(int[] nums) {
    
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i]-1);
            } else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }

    // swap function for arrays
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
