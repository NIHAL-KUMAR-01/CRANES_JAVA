package Template_Java;

class Box<T>{
    private T value;
    Box(T value){
        this.value= value;
    }
    T getdata(){
        return value;
    }
}

public class GenericTemplatedemo{
    public static void main(String[] args) {
        Box<Integer> user = new Box<>(10);
        System.out.println(user.getdata());

        Box<String> user2 = new Box<>("Hello World");
        System.out.println(user2.getdata());
        
    }
}