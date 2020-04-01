class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int l_sum = 0;
        int sumtoindx =0;
        for(int i=0;i< nums.length;i++){
            total+= nums[i];
            
        }
        System.out.println(total);
        for(int i = 0;i < nums.length; i++){
            sumtoindx += nums[i];
             l_sum = sumtoindx - nums[i];
            //System.out.println("lsum"+l_sum);
            //System.out.println(total-l_sum-nums[i]);
            if(total-l_sum-nums[i] == l_sum ){
                return i;
            }
            
        }
        return -1;
    }
}
