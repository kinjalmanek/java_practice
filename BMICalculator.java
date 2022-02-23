import java.util.Scanner;

public class BMICalculator {

    public static void main(String args[]){

        System.out.println( "Please enter your weight : ");

        // get value from user
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();

        System.out.println("Please enter your height : ");
        float height = scanner.nextFloat();

        // calculate bmi
        float bmi = weight / (height * height);

        System.out.print("BMI is = " + bmi);

    }
}
