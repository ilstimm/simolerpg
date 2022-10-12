import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
		int height;
        String s;
        System.out.println("Welcome to the BMI (Body Mass Index) calculator");
        System.out.println("Please enter your weight (kilograms): ");
        weight = input.nextDouble();
        System.out.println("Please enter your height (centimeters): ");
        height = input.nextDouble();
        bmi = weight / ((height * height) / 10000);

        if(bmi < 18.5)
            s = "Underweight";
        else if(bmi >= 18.5 && bmi < 25)
            s = "Normal";
        else if(bmi >= 25 && bmi < 30)
            s = "Overweight";
        else
            s = "obese";
        System.out.printf("Your BMI is %.1f (%s)", bmi, s );
        input.close();
    }
}
