
package FinalProject;
import java.util.InputMismatchException;

import java.math.BigInteger;
import java.util.*;

public class PwoR extends Super_Class{
        @Override
        public void PwoRx(){
        
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Permutation without Repitition");
        System.out.println(" ");
        
    try{    
        System.out.print("Enter the value of n: ");
        int nnum = kv.nextInt();
        System.out.print("Enter the value of r: ");
        int rnum = kv.nextInt();
        
        int xnum = nnum - rnum;
        
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
            System.out.println("Answer: " + Factorial(nnum,rnum,xnum));
            Loop();
        }   
    }
    catch(InputMismatchException xe){
        System.out.print("No Answer : Input must be an integer only");
        Loop();       
    }
        }
        static BigInteger Factorial(int nnum,  int rnum, int xnum){
            BigInteger x =  new BigInteger("1");
            BigInteger y = new  BigInteger("1");
            BigInteger z;
        
        for (int a = 1; a <= nnum; a++){
            x = x.multiply(BigInteger.valueOf(a));
        }
        for (int b = 1; b <= xnum; b++){
            y = y.multiply(BigInteger.valueOf(b));
        }
        
        z = x.divide(y);
        
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
                PwoRx();
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
