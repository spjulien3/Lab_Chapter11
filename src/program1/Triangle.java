package program1;

public class Triangle extends SimpleGeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
        super();
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1+side3+side3;
    }
    public double getArea(){
        double p=getPerimeter()/2;

        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    @Override
    public String toString(){
        return String.format("Side1: %.2f\nSide2: %.2f\nSide3: %.2f\nArea: %.2f\nPerimeter: %.2f\nColor: %s\nFilled: %b"
                ,side1,side2,side3,getArea(),getPerimeter(),getColor(),isFilled());
    }
}