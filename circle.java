import java.util.*;
public class circle implements shape {
    private Point p;
    private double r;

    public circle (Point p, double r) {
        
        this.p = p;
        this.r = r;
    }

    public double getr() {
        return r;
    }

    public Point getp() {
        return p;
    }

    public String tostring() {
        return p+" "+r;
    }

    public double perimeter() {
        return 2* Math.PI * r; 

    }

    public double area() {
        return Math.PI * r * r;

    }

}
