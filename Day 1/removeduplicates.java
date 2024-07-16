class removeduplicates {

   public int removeDuplicates(int[] nums) {
    int index = 0;
    int value = nums[0];
    for(int i = 0;i<nums.length ; i++){
        if(nums[i] > value){
            nums[index+1] = nums[i];
            value = nums[i];
            index++;
        }
    }
    return index+1;
  }
}
   
