//This function or programe does on function and is to find the average by the user inputting 5 numbers as inputs//
//Scanners are used to reade inputs from variables scorse//
import java.util.Scanner;
//class declaration//
public class AverageMarks{
	public static void main(String[]args){
		//Scanner object to read inputs//
		Scanner input = new Scanner(System.in);
		//Variable declaration//

		double totalMarks =0;
		int numberOfUnits=5;

		System.out.println("Please enter the marks for the five units you did last semester:");
		//This is th function that is used to enter the marks, and it has be added a control structure that ensure only 5 unites are added//

		for(int i=1;i<=numberOfUnits;i++){
			System.out.println("Enter marks for units"+i+":");
			double marks = input.nextDouble();
			totalMarks +=marks;
		}
		//this where the function is found by taking total marks and deviding it with number of units
		double average =totalMarks/numberOfUnits;
		System.out.printf("The average marks for the five units is:%2f",average);
		input.close();
	}
}