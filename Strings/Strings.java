public class Strings {
    public static void main(String[] args) {
        String message= new String("Hello World");//literal
        message="Hello Students";
        System.out.println(message);
        System.out.println(message.length());
        char ch[]={'a','s','d'}; 
        System.out.println(ch);
        String s1 = new String(ch);// object
        System.out.println(s1);
        String s= "Keshav";
        s.concat(" Abhishek");
        System.out.println(s);
        s= s.concat(" Abhishek");
        System.out.println(s);  
    }
}