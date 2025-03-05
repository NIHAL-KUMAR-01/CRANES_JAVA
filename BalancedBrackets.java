import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String expression  = "(a+b)*[b+c]+{c*d}";
        Stack <Character> list = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c=='(' || c=='[' || c== '{') {
                list.push(c);
                
            } 
        }

        for (char c : expression.toCharArray()) {
            if (list.isEmpty()==false) {
                if (c == ')' && list.contains(')')) {
                    list.remove(list.indexOf('('));
                    
                    
                }else if (c == ']' && list.contains('[')) {
                    list.remove(list.indexOf('['));
                  
                }else if (c == '}' && list.contains('{')) {
                    list.remove(list.indexOf('{'));
                  
                } 
            } 
        }
        System.out.println(list);

        if (list.isEmpty()) {
            System.out.println("Balanced");
            
        }
    }
    
}
