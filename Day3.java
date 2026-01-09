/*Given three sorted arrays in non-decreasing order, print all common elements in non-decreasing order across these arrays. 
If there are no such elements return an empty array. In this case, the output will be -1.*/



class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
      
        List<Integer> ans = new ArrayList<>();
        int i=0, j=0, k=0;
        
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
            int val1 = arr1.get(i);
            int val2 = arr2.get(j);
            int val3 = arr3.get(k);
            
            if(val1==val2 && val2==val3){
                ans.add(val1);
                i++;
                j++;
                k++;
                
                while(i<arr1.size() && arr1.get(i) == val1){
                    i++;
                }
                while(j<arr2.size() && arr2.get(j) == val2){
                    j++;
                }
                while(k<arr3.size() && arr3.get(k) == val3){
                    k++;
                }
            }else if(val1<val2){
                i++;
            }else if(val2<val3){
                j++;
            }else {
                k++;
            }
        }
        
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
}
