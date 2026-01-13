//Minimum number of Coins

class Solution {
    public int findMin(int n) {
        // code here
        int count = 0;
        while(n>0){
            if(n>=10){
                n-=10;
                count++;
            }
            else if(n>=5){
                n-=5;
                count++;
            }else if(n>=2){
                n-=2;
                count++;
            }else{
                n-=1;
                count++;
            }
        }
        return count;
    }
}
