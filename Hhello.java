//Here is a simple basic program to perform different arithemetic(binary )operatons between two numbers.
import java.util.Scanner;
class Hhello{
    public static void main(String args[]){
        int a=20;
        int b=30;
        int sum=a+b;
        System.out.println("sum is " + sum);
        Scanner sc=new Scanner(System.in);
        //This is only to make code look good.
        System.out.println("-------------------------------------------------------------|");
        System.out.println("|Enter first number (a): ");
        double a=sc.nextDouble();
        System.out.println("|Enter second number (b): ");
        double b=sc.nextDouble();
        //This is only to make code look good.
        System.out.println("--------------------------------------------------------------|");
        System.out.println("Enter the operation  [+]  [-]  [*]  [/]  [%]  [>]  [<]  : ");
        //This is only to make code look good.
        System.out.println("|_____________________________________________________________|");
        char op=sc.next().charAt(0);
     //Switch statement is used for user to select the operation.
        switch (op){
            case '+':
            System.out.println("[Sum of numbers =" + (a+b) +"]");
            break;
            case '-':
            System.out.println("[Difference of numbers =" + (a-b) +"]");
            break;
            case '*':
            System.out.println("Multiplication of numbers = "+ (a*b)+"]");
            break;
            case '%':
            if(b!=0){
            System.out.println("[Remainder is =" + (a%b)+"]");}
            case '/':
            if(b!=0){
                System.out.println("[Divison of numbers = "+(a/b)+"]");}
                else
                System.out.println("Can't divide by zero, ask yourself why.....");
                break;
            case'>':
                System.out.println("[maximum number is = " +(a>b?a:b));
                break;
            case '<':
                System.out.println("Smallest of the two numbers is = " +(a<b?a:b));
                break;
                default:
                System.out.println("Don't do it .....");
                break;}
                //This is only to make code look good.
            System.out.println("|__________________________________________________________|");
              sc.close();
}}

        
        





    
