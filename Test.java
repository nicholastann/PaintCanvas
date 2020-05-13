public class Test {
    public static void Test() {
        pointTest();
        linesegTest();
        squareTest();
        triangleTest();
        circleTest();
        rhombusTest();
        trapezoidTest();
    }

    public static void pointTest() {
        Point p = new Point(3,4);
        System.out.println("      ##### POINT CLASS TESTS #####");
        System.out.println("Point X Location    (Should be 3.0):  "+p.getx());
        System.out.println("Point Y Location    (Should be 4.0):  "+p.getx());
        System.out.println();
    }

    public static void linesegTest() {
        line l = new line(new Point(0,0),new Point(4,3));
        System.out.println("      ##### LINESEG CLASS TESTS #####");
        System.out.println("LineSeg Length      (Should be 5.0):  "+l.length());
        System.out.println("LineSeg Slope       (Should be 0.75): "+l.slope());
        System.out.println("LineSeg Midpoint X  (Should be 2.0):  "+l.midpoint().getx());
        System.out.println("LineSeg Midpoint Y  (Should be 1.5):  "+l.midpoint().getx());
        System.out.println();
    }

    public static void squareTest() {
        square s = new square(
                new line(new Point(1,1),new Point(1,4)),
                new line(new Point(1,4),new Point(4,4)),
                new line(new Point(4,4),new Point(4,1)),
                new line(new Point(4,1),new Point(1,1)));
        System.out.println("      ##### SQUARE CLASS TESTS #####");
        System.out.println("Square Perimeter    (Should be 12.0): "+s.perimeter());
        System.out.println("Square Area         (Should be 9.0):  "+s.area());
        System.out.println();
    }

    public static void triangleTest() {
        triangle t = new triangle(
                new line(new Point(0,0), new Point(5,0)),
                new line(new Point(5,0), new Point(0,12)),
                new line(new Point(0,12), new Point(0,0)));
        System.out.println("      ##### TRIANGLE CLASS TESTS #####");
        System.out.println("Triangle Perimeter  (Should be 30.0): "+t.perimeter());
        System.out.println("Triangle Area       (Should be 30.0): "+t.area());
        System.out.println();
    }

    public static void circleTest() {
        circle c = new circle(new Point(5,7), 1.0);
        System.out.println("      ##### CIRCLE CLASS TESTS #####");
        System.out.println("Circle Perimeter    (Should be 6.28): "+c.perimeter());
        System.out.println("Circle Area         (Should be 3.14): "+c.area());
        System.out.println();
    }

    public static void rhombusTest() {
        rhombus r = new rhombus(
                new line(new Point(0,0), new Point(3,4)),
                new line(new Point(3,4), new Point(8,4)),
                new line(new Point(8,4), new Point(5,0)),
                new line(new Point(5,0), new Point(0,0)));
        System.out.println("      ##### RHOMBUS CLASS TESTS #####");
        System.out.println("Rhombus Perimeter   (Should be 20.0): "+r.perimeter());
        System.out.println("Rhombus Area        (Should be 20.0): "+r.area());
        System.out.println();
    }

    public static void trapezoidTest() {
        trapezoid t = new trapezoid(
                new line(new Point(3,4), new Point(10,4)),
                new line(new Point(12,0), new Point(0,0)),
                new line(new Point(10,4), new Point(12,0)),
                new line(new Point(0,0), new Point(3,4)));
        System.out.println("      ##### TRAPEZOID CLASS TESTS #####");
        System.out.println("Trapezoid Perimeter (Should be 28.47): "+t.perimeter());
        System.out.println("Trapezoid Area      (Should be 38.0):  "+t.area());
        System.out.println();
    }
}