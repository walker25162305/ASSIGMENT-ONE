//The following program is for a calculator that handles 2 number with basic operations//
//scanner for reading inputs from variables scores//
import java.util.Scanner;
//class declaration//
public class BasicCalculator{
	public static void main(String[]args){
		//scanner object to read inputs//
		Scanner input = new Scanner(System.in);
		//variable declaration//

		double num1,num2,result;
		char operator;
		//number inputs//

		System.out.print("Enter the first number:");
		// scanner reads doubles//
		num1 = input.nextDouble();
		System.out.print("Enter the operator(+,-,*,/):");
		//scanner reads characters//
		operator = input.next().charAt(0);
		System.out.print("Enter the second number:");
		//scanner reads double numbers//
		num2 = input.nextDouble();

		result = 0;
		// we use switch case for handling the operations//
		switch(operator){
		case'+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			if(num2 !=0){
				result =num1/num2;
			}else{
				System.out.println("Error:Division by Zero is not allowed.");
				return;
			}
			break;
		default:
			System.out.println("Invalid operator.Please enter one of the following: +,*,/");
			return;
		}
		System.out.println("Result:"+num1+""+operator+""+num2+"="+result);
	}
}