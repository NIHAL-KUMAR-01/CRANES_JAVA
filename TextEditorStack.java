import java.util.Scanner;
import java.util.Stack;

public class TextEditorStack {
    Stack <String> text;
    Scanner sc = new Scanner(System.in);
    TextEditorStack(){
        text= new Stack<>();
    }
    public void addtext(){
        System.out.print("\nEnter text: ");
        String temp = sc.nextLine();
        if (temp.equalsIgnoreCase("undo")) {
            System.out.println(text.peek()+" deleted");
            text.pop();
            for(String e : text){
                System.out.print(e +" ");
            }
            
        }else{
            text.add(temp);
            for(String e : text){
                System.out.print(e +" ");
            }

        }
        
    }

   
    
    public static void main(String[] args) {
        TextEditorStack user = new TextEditorStack();
        while (true) {
            user.addtext();
            
        }
        
    }
    
}
