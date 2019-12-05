
package FinalProject;
import java.util.InputMismatchException;
import java.math.BigInteger;
import java.util.*;

public class CwoR extends Super_Class{

    @Override
    public void CwoRx(){
            
        Scanner kv = new Scanner(System.in);
    
        System.out.println(" ");
        System.out.println("Combination without Repitition");
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
        else if (nnum <=0 || rnum <=0){ 
            System.out.println("No Answer : Input must be a positive integer");
            Loop();
        }
        else if (rnum <= nnum){
            System.out.println("Answer: " + Factorial(nnum,rnum,xnum));
            Loop();
        }
    }
    catch(InputMismatchException ex){
        System.out.print("No Answer : Input must be an integer only");
        Loop();
        }
       
        }
        
        static BigInteger Factorial(int nnum, int rnum, int xnum){
            BigInteger w = new  BigInteger("1");
            BigInteger x = new  BigInteger("1");
            BigInteger y = new  BigInteger("1");
            BigInteger z;
            
        for (int a = 1; a <=nnum; a++){
            w = w.multiply(BigInteger.valueOf(a));
        }
        for (int b = 1; b  <=rnum; b++){
            x = x.multiply(BigInteger.valueOf(b));
        }
        for (int c = 1; c <= xnum; c++){
            y = y.multiply(BigInteger.valueOf(c));
        }
        
        z = w.divide((x.multiply(y)));
        
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
                CwoRx();
                break;
            case "n":
            case "N":
                System.out.println("  ");
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
