/**
 * ==========================================================
 * Program Name: ShapesHierarchy
 * Description : Inheritance
 * Author      : Nihal Kumar
 * Created On  : 08-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */
class Shape{
    String color;
    Shape(){};
    Shape(String color){
        this.color=color;
    }
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
class Circle extends Shape{
    Double radius;
    Circle(){};
    Circle(Double radius){
        super("Red");
        this.radius=radius;
    };
    void draw(){
        System.out.println("Drawing a Circle having radius "+radius+ " Having a Color "+color);
    }

}
class Rectangle extends Shape{
    Double width;
    Double height;
    Rectangle(){};
    Rectangle(Double width,Double height){
        super("Green");
        this.width=width;
        this.height=height;
    };
    void draw(){
        System.out.println("Drawing a Rectangle having Width "+width +" and height "+height +" with  Color "+color);
    }

}
public class ShapesHierarchy {
    public static void main(String[] args) {
        Circle user1=new Circle(25.00);
        user1.draw();
        Rectangle user2= new Rectangle(12.00, 13.00);
        user2.draw();
        
    }
    
}
