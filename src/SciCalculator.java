import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SciCalculator
{
    public static void main(String[] args){
        DecimalFormat dp2 = new DecimalFormat(" #.##"); // required for two decimal points.
        int numCalc = 0;
        double totalValue = 0.0;
        boolean menuCondition = true;
        Scanner sc = new Scanner(System.in);
        double firstOperand = 0, secondOperand = 0;
        int menuValue = 0 ;
        double outputValue = 0;
        //all variable are defined outside the while loop(s) so they all have a base value as 0.

        while (true) {
            while(menuCondition)
            {
                System.out.println("Current Result: " + outputValue);
                System.out.println("\nCalculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("8. Make a Change to a Previous Lab");

                System.out.print("\nEnter Menu Selection: ");

                menuValue = sc.nextInt();
                if (menuValue > 0 || menuValue < 7)
                {
                    break;
                } else break;
            }
            //end of menu while loop, required its own loop for case 7.

            while (menuValue == 7)
            {
                if (firstOperand == 0 && secondOperand == 0)
                {
                    System.out.println("\nError: No calculations yet to average!");
                    System.out.print("\nEnter Menu Selection: ");
                    menuValue = sc.nextInt();
                } else
                    break;
            }

            while  (menuValue <0 || menuValue > 7)
            {  System.out.println("\nError: Invalid selection!");
                System.out.print("\nEnter Menu Selection: ");
                menuValue = sc.nextInt(); //Could have made a default statement instead of another while loop.. smooth
            }
            menuCondition = true;


            switch (menuValue)
            {
                case 0:
                    System.out.println("\nThanks for using this calculator. Goodbye!");
                    System.exit(0);
                    break;
                //terminate program

                case 1: //addition case
                    System.out.print("Enter first operand: ");
                    firstOperand = sc.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = sc.nextDouble();
                    System.out.println();
                    outputValue = firstOperand + secondOperand;
                    totalValue += outputValue;
                    numCalc++ ;

                    //addition case
                    break;

                case 2: //subtraction case
                    System.out.print("Enter first operand: ");
                    firstOperand = sc.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = sc.nextDouble();
                    System.out.println();
                    outputValue = firstOperand - secondOperand;
                    totalValue += outputValue;
                    numCalc++ ;
                    break;

                case 3: //multiplication case
                    System.out.print("Enter first operand: ");
                    firstOperand = sc.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = sc.nextDouble();
                    System.out.println();
                    numCalc++ ;
                    outputValue = firstOperand * secondOperand;
                    totalValue += outputValue;
                    break;

                case 4: //division case
                    System.out.print("Enter first operand: ");
                    firstOperand = sc.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = sc.nextDouble();
                    System.out.println();
                    numCalc++ ;
                    outputValue = firstOperand / secondOperand;
                    totalValue += outputValue;
                    break;

                case 5: //exponentiation case
                    System.out.print("Enter first operand: ");
                    firstOperand = sc.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = sc.nextDouble();
                    System.out.println();
                    numCalc++ ;
                    outputValue = Math.pow(firstOperand, secondOperand);
                    totalValue += outputValue;
                    break;

                case 6: //logarithm case
                    System.out.print("Enter first operand: ");
                    firstOperand = sc.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = sc.nextDouble();
                    System.out.println();
                    numCalc++ ;
                    outputValue = Math.log(secondOperand) / Math.log(firstOperand);
                    totalValue += outputValue;
                    break;

                case 7: //should display the proper average with the right amount of white space.
                    System.out.println("\nSum of calculations: " + totalValue);
                    System.out.println("Number of calculations: " + numCalc);
                    System.out.println("Average of calculations: " + dp2.format( (totalValue) / (numCalc)));
                    menuCondition = false;
                    System.out.print("\nEnter Menu Selection: ");
                    menuValue = sc.nextInt();
                    //if an invalid selection, must enter menu selection option without displaying the menu again.
                    break;
            }

        }
    }
}

