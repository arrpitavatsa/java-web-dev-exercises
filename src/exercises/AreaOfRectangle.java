package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter length of rectangle");
    int length = input.nextInt();
    System.out.println("enter the width of rectangle");
    int width = input.nextInt();
    int area = length*width ;
    System.out.println("Area of rectangle is " +area);
    }
}
