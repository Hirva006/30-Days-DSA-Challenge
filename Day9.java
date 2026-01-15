//Reverse first k elements of a queue

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> s = new Stack<>();
        
        if(q.size() < k || q == null || k<=0){
            return q;
        }
        
        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        int rem = q.size() - k;
        for(int i=0; i<rem; i++){
            q.add(q.remove());
        }
        
        return q;
    }
}
