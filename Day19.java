//Count set bits

// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        return Integer.bitCount(n);
    }
}

//can also be done by doing count++ while(n!=0) and doing n & (n-1)
