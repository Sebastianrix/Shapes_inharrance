package com.company;

class Shape {
    public double Area() {
     return 0;
            }
    public double Circumference(){ return 0;}
        }
class Circle extends Shape {
    private double diameter;
   Circle (double diameter){
       this.diameter = diameter;
   }
    public double Area(){return Math.pow(diameter/2,2)* Math.PI;}
    public double Circumference(){return Math.PI*diameter;}

    }

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle (double width, double height){
        this.height = height;
        this.width = width;
    }
       public double Area(){
     return width * height;
    }
       public double Circumference(){
     return width + width + height + height;
       }
}


public class Polymorphism {
    public static void main(String[] args) {
     Rectangle a = new Rectangle(2,2);
        Circle b = new Circle(3);
         Shape c = new Shape();

    a.Area();
    b.Area();
    c.Area();

    a.Circumference();
    b.Circumference();
    c.Circumference();
//    System.out.println(b.Area);
    }
}
