
package FinalProject;
import java.util.*;
import java.math.BigInteger;
import java.util.InputMismatchException;

public class Pascal extends Super_Class{

    @Override
    public void Pascalsx() {
        Scanner kv= new Scanner(System.in);
        
        try{
        System.out.println(" ");
        System.out.print("Enter row: ");
        int row= kv.nextInt();
        
        System.out.println(" ");
        
        if (row < 0){
            System.out.println("No Answer: You must enter a positive number!");
            Loop();
        }
        else if(row > 500){
            System.out.println("No Answer: Input exceeded the limit number-500");
            Loop();
        }
        
        System.out.println("Row " + row + ": \n");
       
        BigInteger[] result = rowxcomp(row);
        for(BigInteger r: result){

            System.out.print(r + " ");
        }
        System.out.println(" ");
        Loop();
    }
        catch(InputMismatchException xe){
            System.out.println("Invalid! Input should be numbers only. ");
            Loop();
        }
    }
   
    private static BigInteger[] rowxcomp(int row) {
       BigInteger a = new BigInteger("1");
       BigInteger b = new BigInteger("1");
        
        BigInteger[] roa = {a,b};
        for (int r= 2; r <= row; r++){
            BigInteger[] next = new BigInteger[r+1];
            next[0] = a;
            for (int i = 1; i < r; i++){
                next [i] = roa [ i -1 ].add(roa[i]);
                
                
            }
            next[r] = a;
            roa = next;
            
        }
        return roa;
    }
    void Loop(){
        Scanner kv = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Do you want to continue?: [y/n]");
        String choice = kv.nextLine();
        
        switch(choice){
            case "y":
            case "Y":
                Pascalsx();
                break;
            case "n":
            case "N":
                System.out.println(" ");
                System.out.println("Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println(" ");
                System.out.println("Invalid choice! \n");
                Loop();
                break;
        }
    }
}