import java.util.*;
class BalancedString {
    public static void main(String[] args) {
        String str = "{()}[]";
        Stack<Character> balancedStack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                balancedStack.push(str.charAt(i));
            }
            else{
                if(balancedStack.isEmpty()){
                    System.out.println("Unbalanced Stack");
                    break;
                }
                else if(str.charAt(i) == ')'){
                    if(balancedStack.pop() != '('){
                    System.out.println("Unbalanced Stack");
                    break;
                    }
                }
                else if(str.charAt(i) == '}'){
                    if(balancedStack.pop() != '{'){
                    System.out.println("Unbalanced Stack");
                    break;
                    }
                }
                else if(str.charAt(i) == ']'){
                    if(balancedStack.pop() != '['){
                    System.out.println("Unbalanced Stack");
                    break;
                    }
                }
            }
        }
        if(balancedStack.isEmpty()){
            System.out.println("Balanced Stack");
        }
    }
}
