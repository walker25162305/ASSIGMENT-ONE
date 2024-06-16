// This program checks on the divisibility on numbers thats divisibility of the nummber 5,3,2,4,6,8,9. then it givens an out put if a number is divisible//
// scanner is used to read inputs//
import java.util.Scanner;
// class declaretion//
public class DivisibilityTest{
	public static void main(String[]args){
		//scanner object to read inputs//
		Scanner input = new Scanner(System.in);
		//Variable declaretion//
		int number;
		boolean divisibleBy5,divisibleBy3,divisibleBy2,divisibleBy4,divisibleBy6,divisibleBy8,divisibleBy9;

		System.out.print("Enter an integer:");
		// to read integer inputs//
		number = input.nextInt();
		// To handle the divisibility of numbers//

		divisibleBy5=(number%10==0)|| (number%10==5);
		divisibleBy3=(number%9==0)&&(number !=0);
		divisibleBy2=(number%2==0);
		divisibleBy4=(number%4==0);
		divisibleBy6=(number%3==0)&&(number%2==0);
		divisibleBy8=(number%8==0);
		divisibleBy9=(number%9==0);
		// function that checks if a number is devisible by the listed number//

		if(divisibleBy5){
			System.out.println("This number is divisible by 5 because it ends with 0 or 5.");
		}
		if(divisibleBy3){
			System.out.println("This number is divisible by 3");
		}
		if(divisibleBy2){
			System.out.println("This number is divisible by 2");
		}
		if(divisibleBy4){
			System.out.println("This number is divisible by 4");
		}
		if(divisibleBy6){
			System.out.println("This number is divisible by 6");
		}
		if(divisibleBy8){
			System.out.println("This number is divisible by 8");
		}
		if(divisibleBy9){
			System.out.println("This number is divisible by 9");
		}
	}
}