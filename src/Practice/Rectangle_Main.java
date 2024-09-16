package Practice;

import org.w3c.dom.css.Rect;

import java.awt.geom.Area;

public class Rectangle_Main {
    public static void main(String[] args){
        Rectangle r1=new Rectangle(6,6);

        System.out.println(" Area = "+ r1.Area());
        System.out.println(" perimeter  = "+ r1.Perimeter());
    }
}
