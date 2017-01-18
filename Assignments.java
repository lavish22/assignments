package assignments;

/**
 *
 * @author lavish
 */
public class Assignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,b=2;
        System.out.println("\n"+1+2);           // why is it showing 12?
        
        assignment2 a2 = new assignment2();
        a2.OddEven(-1);                         //why is it showing even???
        
        assignment3 a3 = new assignment3();
        a3.Swap();
        
        assignment4 a4 = new assignment4();
        a4.SwapWithoutThirdVariable((byte)4,(byte)9);
        
        assignment5 a5 = new assignment5();
        a5.PrimeOrNot(1303);
    }
    
}
