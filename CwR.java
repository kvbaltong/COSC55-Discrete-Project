
package FinalProject;
import java.util.InputMismatchException;

import java.util.*;
import java.math.BigInteger;

public class CwR extends Super_Class{
    @Override
    public void CwRx(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Combination with Repitition");
        System.out.println(" ");
    
    try{    
        System.out.print("Enter the value of n: ");
        int nnum = kv.nextInt();
        
        System.out.print("Enter the value of r: ");
        int rnum = kv.nextInt();
        
        int xnum = nnum + (rnum - 1);
        int znum = xnum - rnum;
        
        if (rnum>500 || nnum>500){
            System.out.println("No Answer: Input exceeded the limit number-500");
            Loop();
        }
        else if (rnum>nnum){
            System.out.println("No Answer : R should not be greater than N");
            Loop();
        }            
        else if (nnum <=0 && rnum <=0){ 
            System.out.println("No Answer : Input must be a positive integer");
            Loop();
        }
        else if (rnum <= nnum){
            System.out.println("Answer: " + Factorial(rnum,xnum,znum) + "\n");
            Loop();
        }                   
    }
    catch(InputMismatchException xe){
        System.out.print("No Answer : Input must be an integer only \n");
        
        Loop();
        }
    }
    
    static BigInteger Factorial(int rnum, int xnum, int znum){
        BigInteger  w = new BigInteger("1");
        BigInteger  x = new BigInteger("1");
        BigInteger  y = new BigInteger("1");
        BigInteger  z;
        
        for (int a = 1; a <= xnum; a++){
            w = w.multiply(BigInteger.valueOf(a));
        }
        
        for (int b = 1; b <= rnum; b++){
            x = x.multiply(BigInteger.valueOf(b));
        }
        
        for (int c = 1; c <= znum; c++){
            y = y.multiply(BigInteger.valueOf(c));
        }
        
        z = w.divide(x.multiply(y));
        
        return z;
    }
    void Loop(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Do you want to continue?: [y/n]");
        String choice = kv.nextLine();
        
        switch(choice){
            case "y":
            case "Y":
                CwRx();
                break;
            case "n":
            case "N":
                System.out.println(" ");
                System.out.println("Thank you!");
                break;
            default:
                System.out.println(" ");
                System.out.println("Invalid choice! \n");
                Loop();
                break;
        }
    }
}
