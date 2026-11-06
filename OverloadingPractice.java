import java.util.Scanner;

public class OverloadingPractice{

    public static int calculateArea(int side){
        return side*side;
    }
    public static int calculateArea(int length, int breadth){
        return length*breadth;
    }
    public static double calculateArea(double radius){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        double radius = sc.nextDouble();
        System.out.println("Area of square is "+ calculateArea(side));
        System.out.println("Area of rectangle is " + calculateArea(length, breadth));
        System.out.println("Area of circle is "+ calculateArea(radius));
    }
}