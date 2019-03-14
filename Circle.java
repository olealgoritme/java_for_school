public class Circle {

    private double radius = 1.0;
    private String color = "red";
    private static int shapesCounter = 0;
    
    public Circle() {
        // empty constructor
        shapesCounter++;
    }

    public Circle(double radius) {
        // constructor with parameter
        this.radius = radius;
        shapesCounter++;
    }

    public Circle(double radius, String color) {
        // constructor with 2 parameters
        this.radius = radius;
        this.color = color;
        shapesCounter++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }
    public double getRadius() {
        return this.radius;
    }

    public double getArea() { 
        // pi r2
        return (this.radius *  this.radius) * 3.14;
    }

    public double compareArea(double otherArea) {
        if(this.getArea() > otherArea) {
            return (this.getArea() - otherArea);
        } else {
            return (otherArea - this.getArea());
        }
    }

    public String toString() {
        return "Radius: " + this.getRadius() + " Area: " + this.getArea() + " Color: " + this.getColor();
    }

    public static int shapesCreated() {
        return shapesCounter;
    }
    

    public static void main (String[] args) {
        
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getArea());
        
        Circle circle2 = new Circle(5.0, "blue");
        System.out.println(circle2.getColor());
        
        Circle circle3 = new Circle(4.0, "red");
        circle3.setRadius(6.0);
        circle3.setColor("orange");
        System.out.println(circle3.getRadius() + "\n" + circle3.getArea() + "\n" + circle3.getColor());

        Circle circle4 = new Circle(13.0, "yellow");
        Circle circle5 = new Circle(10.0, "red");
        System.out.println("Circle1: " + circle4.getColor() + " area: " + circle4.getArea());
        System.out.println("Circle2: " + circle5.getColor() + " area: " + circle5.getArea());
        System.out.println(circle4.compareArea(circle5.getArea()) + " is the difference in area of the circles\n");

        System.out.println("Shapes created: " + Circle.shapesCreated());

    }
}
