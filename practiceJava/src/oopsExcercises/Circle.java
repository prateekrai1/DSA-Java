package oopsExcercises;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public double area(int radius){
        return Math.PI*(radius*radius);
    }
    public double per(int radius){
        return 2*Math.PI*radius;
    }

    public static void main(String [] Args){
        Circle obj = new Circle(5);
        System.out.println(obj.area(5));
        System.out.println(obj.per(5));

    }
}
