// Multiply two linked lists

/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        
        long mod = 1000000007;
        long a=0, b=0;
        
        while(first != null){
            a = (a * 10 + first.data) % mod;
            first = first.next;
        }
        
        while(second != null){
            b = (b * 10 + second.data) % mod;
            second = second.next;
        }
        return (a*b) % mod;
    }
}
