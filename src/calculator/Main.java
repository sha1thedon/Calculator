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

            else {


            System.out.println(c.evaluate(formula));}
            }
    }
}
