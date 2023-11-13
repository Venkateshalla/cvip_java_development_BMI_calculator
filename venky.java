import java.util.Scanner;

 class BMICalculator {

public static void main(String[] args) throws Exception {
 System.out.print("Please enter weight in kg:= ");
 Scanner keyboard = new Scanner(System.in);
 double weight = keyboard.nextDouble();
 System.out.print("Please enter height in meters:= ");
 double height = keyboard.nextDouble();

 double bmiIndex = calculateBMI(weight,height);

 System.out.println("The BMI index is: "+ bmiIndex);

 if(bmiIndex < 18.5) {
 System.out.println("Underweight");
 }else if (bmiIndex < 25) {
 System.out.println("Normal");
 }else if (bmiIndex < 30) {
 System.out.println("Overweight");
 }else {
 System.out.println("Obese");
 }
 }


 /**************************************************
 * Method to calculate BMI Index
 **************************************************/
 private static double calculateBMI(double weight,double height) {
 return (weight)/(height*height);
 }
}