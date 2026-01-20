//Reverse first k of queue

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q2 = new LinkedList<>();
        int n=q.size();
        
        if(n < k){
            return q;
        }
        
        for(int i=0; i<k; i++){
            s.push(q.peek());
            q.remove();
        }
        
        for(int i=k; i<n; i++){
            q2.add(q.peek());
            q.remove();
        }
        
        for(int i=0; i<k; i++){
            q.add(s.peek());
            s.pop();
        }
        
        for(int i=k; i<n; i++){
            q.add(q2.peek());
            q2.remove();
        }
        
        return q;
    }
}
