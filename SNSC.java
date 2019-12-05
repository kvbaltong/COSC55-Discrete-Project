
package FinalProject;

import java.util.*;
import java.math.*;
import java.util.InputMismatchException;

public class SNSC extends Super_Class{
    @Override
    public void SNSCC(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Stirling Number of Second Case \n");
        
        System.out.print("Enter the value of n: ");
        long nnum = kv.nextInt();
        System.out.print("Enter the value of r: ");
        long rnum = kv.nextInt();
        
    try{    
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
        else if (nnum>=rnum){
            System.out.println(nnum + "C" + rnum + " = " + SNSCx(nnum,rnum));
            Loop();
        }

}
    catch(InputMismatchException xe){
        System.out.println("Invalid! Input should be numbers only.");
        Loop();
    }
    }
    public static BigInteger SNSCx(long nnum, long rnum){
    
            long num1 = rnum;
            long num2 = rnum;
            
            BigInteger factorial = new BigInteger("1");
            BigInteger next = new BigInteger("0");
            BigInteger last = new BigInteger("0");
            BigInteger comp = new BigInteger("0");
            BigInteger help = new BigInteger("-1");
            
            for(int xnum = 0; xnum < rnum; xnum++){
                last = last.add(SNSCz(nnum, rnum, xnum, num1));
                
                num1--;
            }
            System.out.println(" ");
            System.out.println("Sum of all numbers: " + last + "\n");
            
            // R!
            for(int a = 1; a <=  num2; a++){
                factorial = factorial.multiply(BigInteger.valueOf(a));
            }
            
            System.out.println( rnum + "! = "  +  factorial + "\n");
            
            next = last.divide(factorial);
            
            if(next.compareTo(comp) < 0){
                next = next.multiply(help);
                return next;
            }
            else{
                return next;
            }
    }
    
    public static BigInteger SNSCz(long nnum, long rnum, long xnum, long num1){
            long nnum1 = nnum;
            long xnum1 = xnum;
            long rnum1 = rnum;
            long rnum2 = rnum;
            long xnum2 = rnum2 -  xnum;
            
            int res = 1;
            int mul = -1;
            
            BigInteger resultN = new BigInteger("1");
            BigInteger resultR = new BigInteger("1");
            BigInteger resultNR = new BigInteger("1");
            BigInteger xresult;
            BigInteger zresult;
            
            long X = rnum1 - xnum;
            
            BigInteger res2 = new BigInteger("1");
            
            BigInteger F1 = new BigInteger("0");
            BigInteger F2 = new BigInteger("0");
            BigInteger XF = new BigInteger("0");
            
            System.out.println(" ");
            System.out.println("Solution: ");
            
            // (-1)^j
            for(; xnum1 <= rnum; xnum1++){
                res *=  mul;
            }
            
            System.out.println("(-1)^i = " + res);
            
            //Combination
            //N!
            for(long a = 1; a <= rnum1; a++){
                resultN =  resultN.multiply(BigInteger.valueOf(a));
            }
            
            //R!
            for(long b =1; b <= xnum; b++){
                resultR = resultR.multiply(BigInteger.valueOf(b));
            }
            
            //(N-R)!
            for(long c = 1; c <= X; c++){
                resultNR = resultNR.multiply(BigInteger.valueOf(c));
            }
            
            //R! (N-R)!
                xresult = resultR.multiply(resultNR);
                
            //N! / R! (N-R)!
                zresult = resultN.divide(xresult);
                
            //(R-i) ^ N
            while(nnum != 0){
                res2 = res2.multiply(BigInteger.valueOf(xnum2));
                
                nnum--;
            }
            
            //num (-1) ^ i * (jCi) * (j-i) ^ n
            F1 = zresult.multiply(BigInteger.valueOf(res));
            F2 = F1.multiply(res2);
            
            System.out.println(rnum1 + "C" + xnum + " = " + zresult);
            System.out.println(rnum2 + " - " + xnum + " = " + xnum2);
            System.out.println("(" + xnum2 + ")^" + nnum1 + " = " + res2);
            System.out.println("For " + xnum + " = " + F2);
            
            return F2;
    }
        void Loop(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Do you want to continue?: [y/n]");
        String choice = kv.nextLine();
        
        switch(choice){
            case "y":
            case "Y":
                SNSCC();
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
