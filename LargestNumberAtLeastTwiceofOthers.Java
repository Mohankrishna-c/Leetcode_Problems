class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
 
        // Idea is to find the max element in the array, and check if that is atleast greater than twice of the other elements.
        // If so we'll return the max element index else we'll return -1;
        int max = 0;
        int index = 0;
        boolean flag = false;
        // checking if nums have 1 element
        if( nums.length == 1)return 0;
        // finding the max element
        for(int i=0;i< nums.length;i++ ){
            if(nums[i] > max){
            max = nums[i];
            index = i;
        }
        }
        nums[index] = 0;
        System.out.println("Max element is "+ max);
        for(int i=0;i< nums.length;i++ ){
        
        if((max - 2*nums[i]) >=0){
            System.out.println(nums[i]);
            flag =true;
           
        }else{
                flag = false;
              break;  
             } 
        }
       
        if(flag){
            return index;
        }else return -1;
        
        
    }
}
