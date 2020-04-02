class HappyNumber {
// The idea here is to find whether the sum of squares of digits is recurring, if so return false. else continue the process till n==1.
// Main key here is to focus on exit condition, Hence we'll use HashSet and check (seen.contains(sum)), if it satisfies, we'll return false.
public boolean isHappy(int n){
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1){
            int current = n;
            int sum = 0;
            while(current!=0){
                sum+= (current%10)* (current%10);
                current/=10;
            }
            if(seen.contains(sum))return false;
            seen.add(sum);
            n = sum;
            
        }
        return (n==1);
    }
}
