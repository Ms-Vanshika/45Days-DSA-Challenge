class sortcolors {
    public void sortColors(int[] nums) {
        int countr = 0, countw = 0 , countb = 0;
        for(int i = 0 ; i< nums.length ;i++){
            if(nums[i] == 0){
                countr++;
            }
            else if(nums[i] ==1){
                countw++;
            }
            
        }
        for(int i = 0;i<countr ; i++){
            nums[i] = 0;
        }
        for(int i = countr ;i<countr + countw ; i++){
            nums[i] = 1;
        }
        for(int i = countw + countr;i<nums.length ; i++){
            nums[i] = 2;
        }
    }
}
