/**
 * ==========================================================
 * Program Name: stack
 * Description : stack implemented using array
 * Author      : Nihal Kumar
 * Created On  : 11-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

public class stack {
    int max_size;
    int top;
    int array[];
    stack(){};
    stack(int max_size){
        this.max_size=max_size;
        this.top=-1;
        this.array=new int [max_size];
    };

    public void push(int value){
        if (top==max_size-1) {
            System.out.println("Stack Overflow !! Cannot push data");
            
        }else{
            top++;
            array[top]=value;
            System.out.println("The Value "+ value +" is pushed into stack");
        }
    }
    public void pop(){
        if (top==-1) {
            System.out.println("Stack UnderFlow !! Cannot pop Data ");
            
        }else{
            System.out.println("The Value "+array[top] +" is popped from the stack" );
            top--;
        }
    }
    public void peek(){
        if (top==-1) {
            System.out.println("Empty Stack !!");
        }else{
            System.out.println("The Peek of the Stack is : "+ array[top]);
        }
    }
    public void display (){
        System.out.println("Display Data ");
        if (top==-1) {
            System.out.println("Empty Stack !!");
        }else{
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i]+" ");
                
            }
            System.out.println("");
        }
    }


    public static void main(Strings[] args) {
        stack test = new stack(5);
        test.push(10);
        test.push(20);
        test.display();
        test.push(30);
        test.push(40);
        test.push(50);
        test.display();
        
        test.pop();
        test.pop();
        test.display();

        
    }
    
}
