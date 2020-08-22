package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven");
        double miles = input.nextDouble();
        System.out.println("Enter the gas consumed");
        double gasConsumed = input.nextDouble();
        double result = miles/gasConsumed ;
        System.out.println("Miles-per-Gallon is " +result);
    }
}
