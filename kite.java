import java.util.*;
public class kite implements shape {
    private line l1;
    private line l2;
    private line l3;
    private line l4;


    public kite (line l1, line l2, line l3, line l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        
    }

    public line getl1() {
        return l1;
    }

    public line getl2() {
        return l2;
    }

    public line getl3() {
        return l3;
    }

    public line getl4() {
        return l4;
    }
    

    public String tostring() {
        return l1+" "+l2+" "+l3+" "+ l4;
    }

    public double perimeter() {
        return l1.length()+l2.length()+l3.length()+l4.length(); 

    }

    public double area() {
        //return  (Math.sqrt((l1.getb().getx()-l3.getb().getx())*(l1.getb().getx()-l3.getb().getx())+((l1.getb().gety()-l3.getb().gety())*(l1.getb().getx()-l3.getb().getx()))) *  Math.sqrt((l2.getb().getx()-l4.getb().getx()*(l2.getb().getx()-l4.getb().getx()))+((l2.getb().gety()-l4.getb().gety())*(l2.getb().getx()-l4.getb().getx())))) /2;
        //double p = (a.getb.getx()-c.getb().getx())*a.getb.getx()-c.getb().getx()
        return 12;
    }

    
    
    
    
    
}