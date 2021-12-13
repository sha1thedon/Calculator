package calculator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Boolean isOn=true;
        while (isOn) {
            Scanner myObj = new Scanner(System.in);
            Prog c = new Prog();
            System.out.println("Enter your input or type off to stop");
            String formula = myObj.nextLine();

            if (formula.equals("off")){
                System.exit(0);
            }
            
            
            else if (formula.equals("mr")){
               System.out.println(c.getMemoryValue());
            }
            else if (formula.equals("m")){
                c.setMemoryValue(c.getMemoryValue());
            }

            else if(formula.equals("c")){
                System.out.println("memory cleared");
                c.clearMemory();
            }

            

            else {


            System.out.println(c.evaluate(formula));}
            }
    }
}
