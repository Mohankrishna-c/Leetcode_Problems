class SingleNumber {
// The idea here it to find XOR of all the elements in a array, we know XOR to two numbers say, x XOR x =0
// so if we XOR all the elements in the array, we would end up in getting the single digit number
// This programs runs in 0ms with O(1) space complexity.
  public int singleNumber(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }
}
