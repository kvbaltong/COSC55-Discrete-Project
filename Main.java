
package FinalProject;

import java.util.InputMismatchException;
import java.util.Scanner;

// KARL VERNON D. BALTONG
// BEA JODESSA S. KIPTE
// BSCSS 2-1
// DISCRETE MATH PROJECT
// FINALS

public class Main {

    public static void main(String[] args) {
        Loop();
        

    }
    static void Loop(){
        Super_Class SC = new Super_Class();
        
        Scanner kv = new Scanner(System.in);
        
        int ans;
        
        try{
        System.out.println("                MENU \n                  ");
        System.out.println("1. Combination without Repetition");
        System.out.println("2. Permutation without Repetition");
        System.out.println("3. Combination with Repetition");
        System.out.println("4. Permutation with Repetition");
        System.out.println("5. Stirling Number of Second Case");
        System.out.println("6. Pascals Triangle Row Generator");
        System.out.println("7. Exit Program");
        System.out.println(" ");

        System.out.print("Enter your choice: ");
        ans = kv.nextInt();

        switch (ans) {
            case 1:
                SC = new CwoR();
                SC.CwoRx();
                break;
            case 2:
                SC = new PwoR();
                SC.PwoRx();
                break;
            case 3:
                SC = new CwR();
                SC.CwRx();
                break;
            case 4:
                SC = new PwR();
                SC.PwRx();
            case 5:
                SC = new SNSC();
                SC.SNSCC();
                break;
            case 6:
                SC = new Pascal();
                SC.Pascalsx();
                break;
            case 7:
                Exit();
                break;
            default:
                System.out.println(" ");
                System.out.println("Invalid choice, please try again. \n");
                Loop();
                break;
        }
        
    }
        catch(InputMismatchException xe){
            System.out.println(" ");
            System.out.println("Invalid input, please try again. \n");
            Loop();
        }
    }
    public static void Exit(){
        System.out.println(" ");
        System.out.println("Program terminated. Thank you!");
        System.exit(0);
    }
}
