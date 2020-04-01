class Solution {
    public int[] plusOne(int[] digits) {
        // convert array to digit(1,2,3) = 123
        // The idea is to check if the all the digits are 9, if so allocate a plus 1 memory to the array and initialize 1st digit to 1;
        // If the large digit is 9, then initialize it to 0, increment the previous digit to 1;
        for(int i=digits.length-1;i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
            int newArr[] = new int[digits.length+1];
            newArr[0]=1;
            return newArr;
        
    }
}
