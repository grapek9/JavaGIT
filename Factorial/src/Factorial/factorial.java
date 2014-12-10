package Factorial;
import java.util.Scanner;
/**
 * Created by Daniel on 2014-12-10.
 */
public class factorial{
    public static void main(String args[]){
    int n=0;
        System.out.println("Type Digit of Factorial you want to count");
        Scanner digit=new Scanner(System.in);
        n=digit.nextInt();
        System.out.println("Typed Digit/Number = "+digit);
        System.out.println("Iteration Factorial = "+iterationFactorial(n));
        System.out.println("Recursion Factorial = "+recursionFactorial(n));
    }
    public static int iterationFactorial(int n){
        int digit=1;
        for(int i=1;i<=n;i++)
        {
            digit*=i;
        }
    return digit;
    }
    public static int recursionFactorial(int n){

        if(n==0) return 1;
        return n*recursionFactorial(n-1);
    }

}
