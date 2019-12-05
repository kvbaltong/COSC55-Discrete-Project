
package FinalProject;
import java.util.InputMismatchException;

import java.math.BigInteger;
import java.util.*;

public class PwR extends Super_Class{
    @Override
    public void PwRx(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Permumtation with Repitition: ");
        System.out.println(" ");
    
    try{    
        System.out.print("Enter the value of n: ");
        BigInteger nnum = kv.nextBigInteger();
        
        System.out.print("Enter the value of r: ");
        int knum = kv.nextInt();   
        int range = 500;
                
        if (knum>500){
            System.out.println("No Answer: Input exceeded the limit number-500");
            Loop();
        }
        else if(BigInteger.valueOf(range).compareTo(nnum)<0){ 
            System.out.println("No Answer: Input exceeded the limit number-500");
            Loop();
        }
        else if (knum<0){
            System.out.println("No Answer : Input must be a positive integer");
            Loop();
        }

        else if (BigInteger.valueOf(knum).compareTo(nnum)>0){
            System.out.println("No Answer : R should not be greater than N");
            Loop();
        }
        else if (BigInteger.valueOf(knum).compareTo(nnum)<=0){
            BigInteger z = nnum.pow(knum);        
            System.out.println("Answer: " + z);
                System.out.println(" ");
                Loop();
    }
}
    catch (InputMismatchException xe){
        System.out.println("No Answer : Input must be an integer only");
        Loop();
    }
    
    }
    void Loop(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Do you want to continue?: [y/n]");
        String choice = kv.nextLine();
        
        switch(choice){
            case "y":
            case "Y":
                PwRx();
                break;
            case "n":
            case "N":
                System.out.println(" ");
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Invalid choice! \n");
                Loop();
                break;
        }
    }
}