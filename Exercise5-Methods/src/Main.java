import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
1 - Write a Java method to find the smallest number among three
numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0
         */
        System.out.println("Input the first number: ");
        int num1 = input.nextInt();
        System.out.println("Input the Second number: ");
        int num2 = input.nextInt();
        System.out.println("Input the third number: ");
        int num3 = input.nextInt();
        smallest(num1,num2,num3);
/*
2 - Write a Java method that check if the entered number is negative or
positive or zero.
 */
        System.out.println("please enter number : ");
        int number = input.nextInt();
        pos_neg_zero(number);
/*
3 - Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters. A
password consists of only letters and digits. A
password must contain at least two digits.Expected Output:
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
Input a password (You are agreeing to the above Terms and Conditions.):
abcd1234
Password is valid: abcd1234
 */
        System.out.println("please enter the password : ");
        input.nextLine();
        String password = input.nextLine();
        if(validPassword(password)){
            System.out.println("the "+password+" is valid password");
        }else{
            System.out.println("the "+password+" is not a valid password");
        }

    }
    public static boolean validPassword(String password ){
        int count=0;
        if (password.length() >=8){
            for (int i = 0; i < password.length(); i++) {
                if(Character.isLetterOrDigit(password.charAt(i))){
                    if(Character.isDigit(password.charAt(i))){
                        count++;
                    }
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        if(count > 2){
            return true;
        }else {
            return false;
        }
    }
    public static void smallest(int num1,int num2,int num3){
        if(num1 < num2 && num1 < num3){
            System.out.println("The smallest value is "+num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest value is "+num2);
        }else {
            System.out.println("The smallest value is "+num3);
        }
    }
    public static void pos_neg_zero(int num){
        if (num > 0){
            System.out.println("the number "+num+" is positive number");
        } else if (num < 0) {
            System.out.println("the number "+num+" is negative number");
        } else if (num ==0) {
            System.out.println("the number "+num+" is zero number");
        }
    }
}