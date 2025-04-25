import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Input height in centimeters: ");
        double height = input.nextDouble();

        double heightInMeters = height / 100;

        double BMI = weight / (heightInMeters * heightInMeters);
        System.out.print("Body Mass Index is " + BMI );
    }
}