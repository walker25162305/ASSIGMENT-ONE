//This java program is used to determine the number of character in the surname and also determines if your age is odd or even//

import java.util.Scanner;
public class SurnameAndAge{
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String surname;
        int age;
        int surnameLength;
        String ageType;

        System.out.println("Please enter your surname:");
         surname = input.nextLine();

        System.out.println("Please enter your age");
         age= input.nextInt();

         surnameLength = surname.length();
         ageType =(age %2==0)?"even":"odd";

        System.out.println("The number of characters in your surname is:"+surnameLength);
        System.out.println("Your current age is an:"+ageType+"Number");
        input.close();

    }
   }