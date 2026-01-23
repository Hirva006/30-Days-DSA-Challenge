//Postfix evaluation

class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        
        for(String token : arr){
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") ||
                token.equals("^")){
                    
                    int num1 = s.pop();
                    int num2 = s.pop();
                    
                    switch(token){
                        case "+":
                            s.push(num2+num1);
                            break;
                        case "-":
                            s.push(num2-num1);
                            break;
                        case "*":
                            s.push(num2*num1);
                            break;
                        case "/":
                            s.push(Math.floorDiv(num2,num1));
                            break;
                        case "^":
                            s.push((int) Math.pow(num2,num1));
                            break;
                    }
                }
                else{
                    s.push(Integer.parseInt(token));
                }
        }
        return s.peek();
    }
}
