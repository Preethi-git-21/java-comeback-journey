import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter an operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        int result = 0;
        switch(operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        System.out.println("The Result is: " + result);
        scanner.close();
    }
}