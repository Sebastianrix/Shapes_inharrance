package com.company;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
class superclass {
    public void shape() {
        System.out.println("Shapes are made out of points");
        for (float i = 0; i <= 2; ++i) {
            for(float j = 0; j <=2; ++j) {
                float b = i;
                float o = j;
                Point2D.Float n = new Point2D.Float(b,o);
                System.out.println(n);
            }

        }
    }

}
class Circle extends superclass {
        public void shape(){
            Ellipse2D.Float r = new Ellipse2D.Float(50,75,100,250);
        }
    }

class Rectangle extends superclass {
       public void shape(){
           Rectangle2D.Float r = new Rectangle2D.Float(0,0,2,2);
    }
}

/*class Triangle extends superclass {
    public void shape(){
        Triangle2D r = new Triangle2D(float 50,float 75,float 20, float 40,float 70,float 90);
    }
}*/


public class Polymorphism {
    public static void main(String[] args) {
     Rectangle a = new Rectangle();
  //   Triangle c = mew Triangle();
    superclass b = new superclass();

    a.shape();
    b.shape();
    }
}
