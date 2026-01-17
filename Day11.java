//Convert a sentence into its equivalent mobile numeric keypad sequence

// User function Template for Java
class Solution {
    String printSequence(String S) {
        // code here
        String keypad[] = {
            "2", "22","222","3","33","333",
            "4","44","444","5","55","555",
            "6","66","666","7","77","777","7777",
            "8","88","888","9","99","999","9999"
    };
    
    StringBuilder ans = new StringBuilder();
    
    for(int i=0; i<S.length(); i++){
        char ch = S.charAt(i);
        ans.append(ch == ' ' ? "0" : keypad[ch - 'A']);
    }
    return ans.toString();
}
}
