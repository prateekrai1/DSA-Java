package oopsExcercises;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(int width, int height){
        return width * height;
    }


    public static void main(String[] Args){
        Rectangle first =  new Rectangle(2,2);
        System.out.println(first.getArea(5,2));
    }
}
